package com.justin.web.dao.system;


import com.justin.web.entity.system.UserInfoEntity;
import com.justin.web.model.system.UserInfoDto;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：demo
 * @类名称：IUserDao
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-04-24 17:35
 */
public interface IUserInfoDao {
    /**
     * @desc：用户登录
     * @author：justin
     * @date：2018-07-05 10:16
     */
    public UserInfoDto login(UserInfoDto user);

    /**
     * @desc：根据用户名检查用户名是否已经被占用
     * @author：justin
     * @date：2018-07-05 15:49
     */
    public Integer checkUserExist(String userName);

    /**
     * @desc：保存用户信息
     * @author：justin
     * @date：2018-07-05 15:50
     */
    public void saveUserInfo(UserInfoEntity user);

    /**
     * @desc：获取所有用户信息
     * @author：justin
     * @date：2018-07-06 15:58
     */
    public List<UserInfoDto> queryUserInfoList(UserInfoDto user);
}
