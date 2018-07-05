package com.jnc.web.model.demo;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

/** create table easy_poi_demo as
 *   select sys_guid() id,mandt,matnr,arktx maktx,sdkunnr kunnr from third.third_wlm where matnr in (
 *   select code from THIRD.TB_JS_DICTIONARIES where typename='matnrlarge' and notecode in ('JJNK6','JJNK9','JJNK6(15B)'));
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：EasyPoiDemo
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-05-10 14:55
 */
public class EasyPoiDemo implements Serializable {
    @Excel(name = "唯一码", orderNum = "0")
    private String uidstr;
    @Excel(name = "物流码", orderNum = "1")
    private String mandt;
    @Excel(name = "瓶号", orderNum = "2")
    private String boxflag;
    @Excel(name = "物料编码", orderNum = "3")
    private String matnr;
    @Excel(name = "渠道", orderNum = "4")
    private String vtweg;

    private String flag;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getUidstr() {
        return uidstr;
    }

    public void setUidstr(String uidstr) {
        this.uidstr = uidstr;
    }

    public String getMandt() {
        return mandt;
    }

    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    public String getBoxflag() {
        return boxflag;
    }

    public void setBoxflag(String boxflag) {
        this.boxflag = boxflag;
    }

    public String getVtweg() {
        return vtweg;
    }

    public void setVtweg(String vtweg) {
        this.vtweg = vtweg;
    }

    public String getMatnr() {
        return matnr;
    }

    public void setMatnr(String matnr) {
        this.matnr = matnr;
    }
}
