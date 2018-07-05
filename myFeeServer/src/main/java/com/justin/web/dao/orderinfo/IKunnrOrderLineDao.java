package com.jnc.web.dao.orderinfo;

import com.jnc.web.entity.orderinfo.KunnrOrderLineEntity;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：新增连锁渠道
 * @类名称：IOrderInfoDao
 * @类描述：
 * @创建人：zhaohz
 * @创建时间：2018-04-25 17:52
 */
public interface IKunnrOrderLineDao {

    /**
     * @desc：批量保存订单明细
     * @author：justin
     * @date：2018-05-03 18:02
     */
    public void saveOrderLineBatch(List<KunnrOrderLineEntity> orderLines);
}
