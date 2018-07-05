package com.jnc.web.entity.orderinfo;

import com.jnc.web.entity.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @version V0.1
 * @项目名称：新增连锁渠道
 * @类名称：OrderInfoEntity
 * @类描述：
 * @创建人：zhaohz
 * @创建时间：2018-04-25 16:17
 */
public class KunnrOrderEntity extends BaseEntity {

    private String orderNo;                     //订单号
    private String kunnr;                       //经销商编码
    private String kunnrName;                   //经销商名称
    private Long clientId;                    //网点id
    private String clientName;                  //网点名称
    private String vtweg;                       //渠道编码
    private String expArrivalDate;              //预计到货日期
    private Integer amount;                     //订单件数
    private BigDecimal money;                   //订单金额
    private String receiver;                    //收货人
    private String address;                     //收货地址
    private String phoneNum;                    //收货人电话
    private String orderStatus;                 //订单状态 01-初始状态，02-KA审核状态，03-分单员审核状态
    private String note;                        //备注
    private String approveNote;                 //审核人意见
    private String approveBy;                   //审核人账号
    private Date approveDate;                   //审核时间
    private List<KunnrOrderLineEntity> lines;   //订单明细

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getAmount() {
        return amount;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setKunnr(String kunnr) {
        this.kunnr = kunnr;
    }

    public void setKunnrName(String kunnrName) {
        this.kunnrName = kunnrName;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public void setVtweg(String vtweg) {
        this.vtweg = vtweg;
    }

    public void setApproveNote(String approveNote) {
        this.approveNote = approveNote;
    }


    public void setApproveBy(String approveBy) {
        this.approveBy = approveBy;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public String getKunnr() {
        return kunnr;
    }

    public String getKunnrName() {
        return kunnrName;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getVtweg() {
        return vtweg;
    }

    public String getApproveNote() {
        return approveNote;
    }


    public String getApproveBy() {
        return approveBy;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setLines(List<KunnrOrderLineEntity> lines) {
        this.lines = lines;
    }

    public List<KunnrOrderLineEntity> getLines() {
        return lines;
    }


    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setExpArrivalDate(String expArrivalDate) {
        this.expArrivalDate = expArrivalDate;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getClientName() {
        return clientName;
    }

    public String getExpArrivalDate() {
        return expArrivalDate;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getNote() {
        return note;
    }

}
