package com.justin.web.service.impl.system;

import com.justin.web.dao.system.IUserInfoDao;
import com.justin.web.entity.system.UserInfoEntity;
import com.justin.web.model.system.UserInfoDto;
import com.justin.web.service.system.IUserInfoService;
import com.justin.web.util.PasswordUtil;
import com.justin.web.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @version V0.1
 * @项目名称：demo
 * @类名称：UserServiceImpl
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-04-24 17:34
 */
@Service
@Transactional
public class UserInfoServiceImpl implements IUserInfoService {
    @Autowired
    private IUserInfoDao userInfoDao;

    @Override
    public UserInfoDto login(UserInfoDto user) {
        user.setPassword(PasswordUtil.getMD5(user.getPassword()));
        return userInfoDao.login(user);
    }

    @Override
    public Integer checkUserExist(String userName) {
        return userInfoDao.checkUserExist(userName);
    }

    @Override
    public void saveUserInfo(UserInfoEntity user) {
        user.setId(UUIDUtil.get32UUID());
        user.setPassword(PasswordUtil.getMD5(user.getPassword()));//密码进行加密
        user.setCreateBy(user.getUserName());
        user.setCreateDate(new Date());
        userInfoDao.saveUserInfo(user);
    }

    @Override
    public List<UserInfoDto> queryUserInfoList(UserInfoDto user) {
        return userInfoDao.queryUserInfoList(user);
    }
}
