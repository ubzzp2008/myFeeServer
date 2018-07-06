package com.justin.web.service.impl.feeInfo;

import com.justin.web.dao.feeInfo.IFeeInfoDao;
import com.justin.web.entity.feeInfo.FeeInfoEntity;
import com.justin.web.model.feeInfo.FeeInfoDto;
import com.justin.web.service.feeInfo.FeeInfoService;
import com.justin.web.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @version V0.1
 * @项目名称：myproject
 * @类名称：FeeInfoServiceImpl
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-06-29 22:18
 */
@Service
public class FeeInfoServiceImpl implements FeeInfoService {
    @Autowired
    private IFeeInfoDao feeInfoDao;

    @Override
    public void saveFeeInfo(FeeInfoEntity feeInfo) {
        feeInfo.setId(UUIDUtil.get32UUID());
        feeInfo.setCreateDate(new Date());
        feeInfoDao.saveFeeInfo(feeInfo);
    }

    @Override
    public List<FeeInfoDto> queryFeeInfoList(FeeInfoDto feeInfo) {
        return feeInfoDao.queryFeeInfoList(feeInfo);
    }

    @Override
    public BigDecimal findFeeTotal(FeeInfoDto feeInfo) {
        return feeInfoDao.findFeeTotal(feeInfo);
    }
}
