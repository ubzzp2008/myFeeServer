package com.justin.web.dao.demo;


import com.justin.web.model.demo.EasyPoiDemo;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：IEasyPoiDao
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-05-10 15:03
 */
public interface IEasyPoiDao {

    public List<EasyPoiDemo> queryAll(EasyPoiDemo demo);

    public void saveDataBatch(List<EasyPoiDemo> list);
}
