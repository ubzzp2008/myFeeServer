package com.justin.web.dao.feeInfo;

import com.justin.web.entity.feeInfo.FeeInfoEntity;
import com.justin.web.model.feeInfo.FeeInfoDto;

import java.math.BigDecimal;
import java.util.List;

/**
 * @version V0.1
 * @项目名称：myproject
 * @类名称：FeeInfoDao
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-06-29 22:02
 */
public interface IFeeInfoDao {
    /**
     * 保存费用信息
     *
     * @author justion.zhou
     * @date 2016-6-11 下午:31:10
     */
    public void saveFeeInfo(FeeInfoEntity feeInfo);


    /**
     * 获取角色集合
     *
     * @return
     * @author justion.zhou
     * @date 2016-6-11 下午7:20:51
     */
    public List<FeeInfoDto> queryFeeInfoList(FeeInfoDto feeInfo);

    /**
     * @desc：获取总费用金额
     * @author：justin
     * @date：2018-07-05 17:53
     */
    public BigDecimal findFeeTotal(FeeInfoDto feeInfo);
}
