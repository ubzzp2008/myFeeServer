package com.jnc.web.controller.orderinfo;

import com.alibaba.fastjson.JSONObject;
import com.jnc.web.controller.base.BaseController;
import com.jnc.web.entity.orderinfo.KunnrOrderEntity;
import com.jnc.web.model.base.AjaxJson;
import com.jnc.web.service.orderinfo.IKunnrOrderService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @version V0.1
 * @项目名称：新增连锁渠道
 * @类名称：OrderInfoController
 * @类描述：
 * @创建人：zhaohz
 * @创建时间：2018-04-25 17:48
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/kunnrOrder")
public class KunnrOrderController extends BaseController{

    @Autowired
    private IKunnrOrderService kunnrOrderService;
    /**
     * @desc：新增订单
     * @author：zhaohz
     * @date： 2018/4/27 10:32
     */
    @RequestMapping("/saveOrder")
    public String saveOrder(@RequestBody String info) {
        AjaxJson json = new AjaxJson();
        try {
            logger.info("获取json格式参数："+info);
            if(StringUtils.isNotEmpty(info)){
                KunnrOrderEntity order = JSONObject.parseObject(info, KunnrOrderEntity.class);
                if(CollectionUtils.isNotEmpty(order.getLines())){
                    kunnrOrderService.saveOrder(order);
                    json.setSuccess(true);
                    json.setMsg("订单保存成功!");
                    json.setObj(order.getOrderNo());
                }else{
                    json.setSuccess(false);
                    json.setMsg("操作失败!订单行项目为空！");
                }
            }else{
                json.setSuccess(false);
                json.setMsg("操作失败！参数为空！");
            }
        }catch (Exception e){
            json.setSuccess(false);
            json.setMsg("程序异常,请联系管理员!");
            e.printStackTrace();
            logger.error("保存订单异常",e);
        }
       return returnJson(json);
    }

}
