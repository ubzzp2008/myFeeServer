package com.jnc.web.service.orderinfo.impl;


import com.jnc.web.dao.orderinfo.IKunnrOrderDao;
import com.jnc.web.entity.orderinfo.KunnrOrderEntity;
import com.jnc.web.entity.orderinfo.KunnrOrderLineEntity;
import com.jnc.web.dao.orderinfo.IKunnrOrderLineDao;
import com.jnc.web.service.orderinfo.IKunnrOrderService;
import com.jnc.web.util.StaticParam;
import com.jnc.web.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @version V0.1
 * @项目名称：新增连锁渠道
 * @类名称：OrderInfoServiceImpl
 * @类描述：
 * @创建人：zhaohz
 * @创建时间：2018-04-25 17:53
 */
@Service
@Transactional
public class KunnrOrderServiceImpl implements IKunnrOrderService {
    @Autowired
    private IKunnrOrderDao kunnrOrderDao;

    @Autowired
    private IKunnrOrderLineDao kunnrOrderLineDao;

    /**
     * @desc：获取10位随机订单号
     * @author：zhaohz
     * @date： 2018/4/27 10:32
     */
    public static synchronized String getRandomOrderNo() {
        int length = 10;
        String base = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    @Override
    public void saveOrder(KunnrOrderEntity order) {
        String orderNo=getRandomOrderNo();
        order.setId(UUIDUtil.get32UUID());
        order.setOrderNo(orderNo);
        order.setStatus(StaticParam.ADD_STATUS);
        order.setOrderStatus(StaticParam.INIT_STATUS);
        kunnrOrderDao.saveOrder(order);
        for (KunnrOrderLineEntity line : order.getLines()) {
            line.setId(UUIDUtil.get32UUID());
            line.setOrderNo(orderNo);
            line.setStatus(StaticParam.ADD_STATUS);
        }
        kunnrOrderLineDao.saveOrderLineBatch(order.getLines());
    }
}
