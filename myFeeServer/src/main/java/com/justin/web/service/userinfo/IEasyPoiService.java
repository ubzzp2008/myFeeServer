package com.jnc.web.service.userinfo;

import com.jnc.web.entity.userinfo.UserInfoEntity;
import com.jnc.web.model.demo.EasyPoiDemo;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：IEasyPoiService
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-05-10 15:04
 */
public interface IEasyPoiService {
    public List<EasyPoiDemo> queryAll(EasyPoiDemo demo);

    public void saveDataBatch(List<EasyPoiDemo> list);
}
