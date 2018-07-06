package com.justin.web.model.feeInfo;

import com.justin.web.model.base.BaseDto;

import java.math.BigDecimal;

/**
 * @version V0.1
 * @项目名称：myproject
 * @类名称：FeeInfoDto
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-06-29 21:32
 */
public class FeeInfoDto extends BaseDto {

    /**
     * 费用类型 收入：IN，支出：OUT
     */
    private String feeType;//费用类型

    /**
     * 费用日期 yyyy-MM-dd
     */
    private String useDate;//费用日期

    /**
     * 费用金额
     */
    private BigDecimal money;//费用金额

    /**
     * 费用说明
     */
    private String useContent;//费用说明

    /**
     * 费用备注
     */
    private String note;//备注

    /**
     * 创建时间
     */
    private String createDateStr;//创建时间

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getUseDate() {
        return useDate;
    }

    public void setUseDate(String useDate) {
        this.useDate = useDate;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getUseContent() {
        return useContent;
    }

    public void setUseContent(String useContent) {
        this.useContent = useContent;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreateDateStr() {
        return createDateStr;
    }

    public void setCreateDateStr(String createDateStr) {
        this.createDateStr = createDateStr;
    }
}
