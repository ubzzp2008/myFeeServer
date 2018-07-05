package com.justin.web.controller.base;

import com.alibaba.fastjson.JSON;
import com.justin.web.model.base.AjaxJson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：BaseController
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-05-04 11:13
 */
public class BaseController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @desc：返回json格式的字符串
     * @author：justin
     * @date：2018-05-04 11:43
     */
    public String returnJson(AjaxJson json) {
        logger.info("返回的json格式：" + JSON.toJSONString(json));
        return JSON.toJSONString(json);
    }

    /**
     * 描述：返回json格式数据到前端页面
     *
     * @author justin
     * @创建时间 2017年6月14日 下午3:24:20
     */
    public void writeJson(Object object, HttpServletResponse response) {
        try {
            String json = JSON.toJSONStringWithDateFormat(object, "yyyy-MM-dd HH:mm:ss");
            response.setContentType("text/html;charset=utf-8");
            // response.setContentType("application/json");
            response.getWriter().write(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
