package com.justin.web.controller.system;

import com.justin.web.controller.base.BaseController;
import com.justin.web.service.system.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V0.1
 * @项目名称：demo
 * @类名称：UserController
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-04-24 16:58
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/userInfo")
public class UserInfoController extends BaseController {

    @Autowired
    private IUserInfoService userInfoService;

    @RequestMapping("/queryAllUser")
    public String queryAllUser() {
//        UserInfoDto user=new UserInfoDto();
//        List<UserInfoEntity> userList=userInfoService.queryAllUser(user);
//        String string=JSONArray.toJSONString(userList);
        return "";
    }


}