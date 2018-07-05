package com.justin.web.service.userinfo.impl;

import com.justin.web.dao.userinfo.IUserInfoDao;
import com.justin.web.entity.userinfo.UserInfoEntity;
import com.justin.web.model.userinfo.UserInfoDto;
import com.justin.web.service.userinfo.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public List<UserInfoEntity> queryAllUser(UserInfoDto user) {
        return userInfoDao.queryAllUser(user);
    }
}
