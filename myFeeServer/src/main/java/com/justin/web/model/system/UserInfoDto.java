package com.justin.web.model.system;

import com.justin.web.model.base.BaseDto;

/**
 * @version V0.1
 * @项目名称：demo
 * @类名称：UserInfoDto
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-04-24 18:03
 */
public class UserInfoDto extends BaseDto {
    /**
     * 登陆账号
     */
    private String userName;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 登陆密码
     */
    private String password;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 性别
     */
    private String sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
