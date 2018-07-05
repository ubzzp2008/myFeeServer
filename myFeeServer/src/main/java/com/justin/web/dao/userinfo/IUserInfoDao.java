package com.jnc.web.dao.userinfo;

import com.jnc.web.entity.userinfo.UserInfoEntity;
import com.jnc.web.model.userinfo.UserInfoDto;

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

    public List<UserInfoEntity> queryAllUser(UserInfoDto user);
}
