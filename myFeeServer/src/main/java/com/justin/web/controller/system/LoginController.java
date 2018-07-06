package com.justin.web.controller.system;

import com.justin.web.controller.base.BaseController;
import com.justin.web.entity.system.UserInfoEntity;
import com.justin.web.model.base.AjaxJson;
import com.justin.web.model.system.UserInfoDto;
import com.justin.web.service.system.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private IUserInfoService userInfoService;

    /**
     * @desc：手机端用户登陆接口
     * @author：justin
     * @date：2018-07-05 15:43
     */
    @RequestMapping("/login")
    @ResponseBody
    public void login(@RequestBody UserInfoDto user, HttpServletRequest req, HttpServletResponse response) {
        AjaxJson json = new AjaxJson();
        try {
            UserInfoDto u = userInfoService.login(user);
            if (u != null) {
                json.setSuccess(true);
                json.setObj(u);
                json.setMsg("登录成功");
            } else {
                json.setMsg("用户名或密码错误!");
                json.setSuccess(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            json.setMsg("服务器异常！请联系管理员！");
            json.setSuccess(false);
        }
        writeJson(json, response);
    }


    /**
     * @desc：手机端用户注册接口
     * @author：justin
     * @date：2018-07-05 15:43
     */
    @RequestMapping("/registerUser")
    @ResponseBody
    public void registerUser(@RequestBody UserInfoEntity user, HttpServletRequest req, HttpServletResponse response) {
        AjaxJson json = new AjaxJson();
        try {
            //根据用户名检查用户名是否被占用
            Integer count = userInfoService.checkUserExist(user.getUserName());//用户名在手机端已经转小写
            if (count == 0) {
                userInfoService.saveUserInfo(user);
                json.setSuccess(true);
                json.setMsg("恭喜你！注册成功！");
            } else {
                json.setSuccess(false);
                json.setMsg("注册失败！用户名已经被占用！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            json.setMsg("服务器异常！请联系管理员！");
            json.setSuccess(false);
        }
        writeJson(json, response);
    }
}
