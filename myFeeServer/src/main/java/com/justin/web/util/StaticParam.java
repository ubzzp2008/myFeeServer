package com.justin.web.util;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：StaticParam
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-05-03 17:56
 */
public class StaticParam {

/**************************数据状态*************************************************/
    /**
     * 数据新增状态
     */
    public static String ADD_STATUS = "009";

    /**
     * 数据修改状态
     */
    public static String MOD_STATUS = "004";

    /**
     * 数据删除状态
     */
    public static String DEL_STATUS = "003";


    /**************************订单状态*************************************************/
    /**
     * 订单状态 10-初始状态
     */
    public static String INIT_STATUS = "10";

    /**
     * 订单状态 20-KA审核状态
     */
    public static String KA_APPROVED = "20";

    /**
     * 订单状态 30-分单员审核状态
     */
    public static String FDY_APPROVED = "30";


}
