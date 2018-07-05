package com.justin.web.controller.system;

import com.justin.web.controller.base.BaseController;
import com.justin.web.model.base.AjaxJson;
import com.justin.web.model.system.UserInfoDto;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version V0.1
 * @项目名称：myFeeServer
 * @类名称：LoginController
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-07-05 09:54
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/login")
public class LoginController extends BaseController {

    @RequestMapping("/login")
    @ResponseBody
    public void login(@RequestBody UserInfoDto user, HttpServletRequest req, HttpServletResponse response) {
        AjaxJson json = new AjaxJson();
//        UserInfoDto u = userInfoService.checkUserExits(user.getUserName(), user.getPassword());
//        if (u != null) {
//            json.setSuccess(true);
//            json.setObj(u);
//            json.setMsg("登录成功");
//        } else {
//            json.setMsg("用户名或密码错误!");
//            json.setSuccess(false);
//        }
        writeJson(json, response);
    }
}
