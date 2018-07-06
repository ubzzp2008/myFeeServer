package com.justin.web.controller.feeInfo;


import com.justin.web.controller.base.BaseController;
import com.justin.web.entity.feeInfo.FeeInfoEntity;
import com.justin.web.model.base.AjaxJson;
import com.justin.web.model.feeInfo.FeeInfoDto;
import com.justin.web.service.feeInfo.FeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

/**
 * @version V0.1
 * @项目名称：myproject
 * @类名称：FeeInfoAI
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-06-29 22:23
 */
@Controller
@RequestMapping("/feeInfo")
public class FeeInfoController extends BaseController {
    @Autowired
    private FeeInfoService feeInfoService;

    /**
     * @desc：保存费用数据
     * @author：justin
     * @date：2018-07-05 17:49
     */
    @RequestMapping("/addFeeInfo")
    @ResponseBody
    public void addFeeInfo(@RequestBody FeeInfoEntity feeInfo, HttpServletRequest req, HttpServletResponse response) {
        AjaxJson json = new AjaxJson();
        try {
            feeInfoService.saveFeeInfo(feeInfo);
            json.setSuccess(true);
            json.setMsg("保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            json.setSuccess(false);
            json.setMsg("保存失败！系统异常！");
        }
        writeJson(json, response);
    }

    /**
     * @desc：获取费用数据
     * @author：justin
     * @date：2018-07-05 17:49
     */
    @RequestMapping("/queryFeeInfoList")
    @ResponseBody
    public void queryFeeInfoList(@RequestBody FeeInfoDto feeInfo, HttpServletRequest req, HttpServletResponse response) {
        AjaxJson json = new AjaxJson();
        try {
            List<FeeInfoDto> list = feeInfoService.queryFeeInfoList(feeInfo);
            BigDecimal feeTotal = feeInfoService.findFeeTotal(feeInfo);
            json.setSuccess(true);
            json.setObj(list);
            json.setMsg(feeTotal.toString());
        } catch (Exception e) {
            e.printStackTrace();
            json.setSuccess(false);
            json.setMsg("系统异常！获取数据失败！");
        }
        writeJson(json, response);
    }
}
