package com.jnc.web.entity.orderinfo;

import com.jnc.web.entity.base.BaseEntity;

import java.math.BigDecimal;

/**
 * @version V0.1
 * @项目名称：新增连锁渠道
 * @类名称：OrderLineInfoEntity
 * @类描述：
 * @创建人：zhaohz
 * @创建时间：2018-04-25 16:18
 */
public class KunnrOrderLineEntity extends BaseEntity{

    private String orderNo;             //订单号
    private String orderLineNo;         //订单行号
    private String matnr;               //物料代码
    private String maktx;               //物料名称
    private Integer amount;             //件数
    private BigDecimal price;           //单价
    private BigDecimal money;           //总价
    private KunnrOrderEntity order;     //订单抬头

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getAmount() {
        return amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setOrderLineNo(String orderLineNo) {
        this.orderLineNo = orderLineNo;
    }

    public void setMatnr(String matnr) {
        this.matnr = matnr;
    }

    public void setMaktx(String maktx) {
        this.maktx = maktx;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getOrderLineNo() {
        return orderLineNo;
    }

    public String getMatnr() {
        return matnr;
    }

    public String getMaktx() {
        return maktx;
    }

    public KunnrOrderEntity getOrder() {
        return order;
    }

    public void setOrder(KunnrOrderEntity order) {
        this.order = order;
    }
}
