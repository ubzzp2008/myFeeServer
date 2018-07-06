package com.justin.web.controller.system;

import com.justin.web.controller.base.BaseController;
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
import java.util.List;

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

    @RequestMapping("/queryUserInfoList")
    @ResponseBody
    public void queryUserInfoList(@RequestBody UserInfoDto user, HttpServletRequest req, HttpServletResponse response) {
        AjaxJson json = new AjaxJson();
        try {
            List<UserInfoDto> list = userInfoService.queryUserInfoList(user);
            json.setSuccess(true);
            json.setObj(list);
            json.setMsg("获取数据成功");
        } catch (Exception e) {
            e.printStackTrace();
            json.setSuccess(false);
            json.setMsg("系统异常！获取数据失败！");
        }
        writeJson(json, response);
    }


}
