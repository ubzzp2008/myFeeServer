package com.jnc.web.controller.userinfo;

import com.jnc.web.controller.base.BaseController;
import com.jnc.web.model.demo.EasyPoiDemo;
import com.jnc.web.model.demo.Person;
import com.jnc.web.service.userinfo.IEasyPoiService;
import com.jnc.web.util.EasyPoiUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：EasyPoiController
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-05-10 15:02
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/easyPoi")
public class EasyPoiController extends BaseController {

    @Autowired
    private IEasyPoiService easyPoiService;

    @RequestMapping("/queryAll03")
    public void queryAll03(HttpServletRequest request,HttpServletResponse response)  {
        EasyPoiDemo demo=new EasyPoiDemo();
        String flag=request.getParameter("flag");
        String matnr=request.getParameter("matnr");
        String vtweg=request.getParameter("vtweg");
        logger.info("标识："+flag+"==="+matnr+"==="+vtweg);
        if(StringUtils.isNotEmpty(flag)){
            demo.setFlag(flag);
        }
        if(StringUtils.isNotEmpty(matnr)){
            demo.setMatnr(matnr);
        }
        if(StringUtils.isNotEmpty(vtweg)){
            demo.setVtweg(vtweg);
        }
        long a=System.currentTimeMillis();
        List<EasyPoiDemo> list=easyPoiService.queryAll(demo);
        long b=System.currentTimeMillis();
        logger.info("查询耗时："+(b-a)/1000+"m");
        logger.info(list.size()+"");
        //导出操作
        EasyPoiUtil.exportExcelXls(list,null,null,EasyPoiDemo.class,"物流码信息.xls",response);
        long c = System.currentTimeMillis();    //开始时间
        logger.info("写入excel耗时："+(c-b)/1000+"m");
    }

    @RequestMapping("/queryAll07")
    public void queryAll07(HttpServletRequest request,HttpServletResponse response)  {
        EasyPoiDemo demo=new EasyPoiDemo();
        String flag=request.getParameter("flag");
        String matnr=request.getParameter("matnr");
        String vtweg=request.getParameter("vtweg");
        logger.info("标识："+flag+"==="+matnr+"==="+vtweg);
        if(StringUtils.isNotEmpty(flag)){
            demo.setFlag(flag);
        }
        if(StringUtils.isNotEmpty(matnr)){
            demo.setMatnr(matnr);
        }
        if(StringUtils.isNotEmpty(vtweg)){
            demo.setVtweg(vtweg);
        }
        long a=System.currentTimeMillis();
        List<EasyPoiDemo> list=easyPoiService.queryAll(demo);
        long b=System.currentTimeMillis();
        logger.info("查询耗时："+(b-a)/1000+"m");
        logger.info(list.size()+"");
        //导出操作
        EasyPoiUtil.exportExcelXlsx(list,null,null,EasyPoiDemo.class,"物流码信息.xlsx",response);
        long c = System.currentTimeMillis();    //开始时间
        logger.info("写入excel耗时："+(c-b)/1000+"m");
    }


    @RequestMapping("/easyPoiImport")
    public void easyPoiImport(HttpServletResponse response){
        String filePath = "E:\\箱码信息.xlsx";
        //解析excel，
        long a=System.currentTimeMillis();
        List<EasyPoiDemo> list = EasyPoiUtil.importExcel(filePath,0,1,EasyPoiDemo.class);
        long b=System.currentTimeMillis();
        logger.info("解析excel耗时："+(b-a)/1000+"m");
        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
        easyPoiService.saveDataBatch(list);
        long c=System.currentTimeMillis();
        logger.info("写入数据库耗时："+(c-b)/1000+"m");
        System.out.println("导入数据一共【"+list.size()+"】行");

    }
}
