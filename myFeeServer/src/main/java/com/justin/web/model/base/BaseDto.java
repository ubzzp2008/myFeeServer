package com.justin.web.model.base;

import java.io.Serializable;
import java.util.Date;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：BaseDto
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-05-03 17:30
 */
public class BaseDto implements Serializable {
    /**
     * 主键ID  32位UUID
     */
    private String id;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 最后修改人
     */
    private String updateBy;
    /**
     * 最后修改时间
     */
    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
