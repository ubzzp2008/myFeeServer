package com.jnc.web.model.userinfo;

/**
 * @version V0.1
 * @项目名称：demo
 * @类名称：UserInfoDto
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-04-24 18:03
 */
public class UserInfoDto {
    private String mandt;
    private String kunnr;

    public String getMandt() {
        return mandt;
    }

    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    public String getKunnr() {
        return kunnr;
    }

    public void setKunnr(String kunnr) {
        this.kunnr = kunnr;
    }
}
