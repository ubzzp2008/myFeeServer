package com.jnc.web.service.userinfo.impl;

import com.jnc.web.dao.userinfo.IEasyPoiDao;
import com.jnc.web.model.demo.EasyPoiDemo;
import com.jnc.web.service.userinfo.IEasyPoiService;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：EasyPoiServiceImpl
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-05-10 15:04
 */
@Service
@Transactional
public class EasyPoiServiceImpl implements IEasyPoiService {
    @Autowired
    private IEasyPoiDao easyPoiDao;
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<EasyPoiDemo> queryAll(EasyPoiDemo demo) {
        return easyPoiDao.queryAll(demo);
    }

    @Override
    public void saveDataBatch(List<EasyPoiDemo> list) {
//        int result = 1;
//        SqlSession batchSqlSession = null;
//        try {
//            batchSqlSession = sqlSessionTemplate
//                    .getSqlSessionFactory()
//                    .openSession(ExecutorType.BATCH, false);// 获取批量方式的sqlsession
//            int batchCount = 1000;// 每批commit的个数
//            int batchLastIndex = batchCount;// 每批最后一个的下标
//            for (int index = 0; index < members.size();) {
//                if (batchLastIndex >= members.size()) {
//                    batchLastIndex = members.size();
//                    result = result * batchSqlSession.insert("MutualEvaluationMapper.insertCrossEvaluation",members.subList(index, batchLastIndex));
//                    batchSqlSession.commit();
//                    System.out.println("index:" + index+ " batchLastIndex:" + batchLastIndex);
//                    break;// 数据插入完毕，退出循环
//                } else {
//                    result = result * batchSqlSession.insert("MutualEvaluationMapper.insertCrossEvaluation",members.subList(index, batchLastIndex));
//                    batchSqlSession.commit();
//                    System.out.println("index:" + index+ " batchLastIndex:" + batchLastIndex);
//                    index = batchLastIndex;// 设置下一批下标
//                    batchLastIndex = index + (batchCount - 1);
//                }
//            }
//            batchSqlSession.commit();
//        }
//        finally {
//            batchSqlSession.close();
//        }
//        return Tools.getBoolean(result);
    }
}
