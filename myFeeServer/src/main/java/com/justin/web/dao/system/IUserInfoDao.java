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

    public List<UserInfoEntity> queryAllUser(UserInfoDto user);
}
