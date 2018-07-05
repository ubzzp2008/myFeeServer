package com.jnc.web.model.demo;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：SzkDemo
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-05-24 16:02
 */
public class SzkDemo  implements Serializable {

    @Excel(name = "防伪码", orderNum = "0")
    private String code;
    @Excel(name = "序列号", orderNum = "1")
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
