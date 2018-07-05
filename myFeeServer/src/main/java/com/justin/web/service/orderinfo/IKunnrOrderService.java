package com.jnc.web.service.orderinfo;

import com.jnc.web.entity.orderinfo.KunnrOrderEntity;

/**
 * @version V0.1
 * @项目名称：新增连锁渠道
 * @类名称：IOrderInfoService
 * @类描述：
 * @创建人：zhaohz
 * @创建时间：2018-04-25 17:53
 */
public interface IKunnrOrderService {

    /**
     * @desc：新增订单
     * @author：zhaohz
     * @date： 2018/4/27 10:32
     */
    public void saveOrder(KunnrOrderEntity order);

}
