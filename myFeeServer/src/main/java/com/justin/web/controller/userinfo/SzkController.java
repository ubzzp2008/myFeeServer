package com.jnc.web.controller.userinfo;

import com.jnc.web.controller.base.BaseController;
import com.jnc.web.model.demo.EasyPoiDemo;
import com.jnc.web.model.demo.SzkDemo;
import com.jnc.web.service.userinfo.ISzkService;
import com.jnc.web.util.EasyPoiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：SzkController
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-05-24 16:04
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/szk")
public class SzkController extends BaseController {
    @Autowired
    private ISzkService szkService;

    @RequestMapping("/import")
    public void easyPoiImport(HttpServletRequest request, HttpServletResponse response){
        String flag=request.getParameter("flag");
        String filePath = "E:\\szk\\szk"+flag+".xlsx";
        //解析excel，
        long a=System.currentTimeMillis();
        List<SzkDemo> list = EasyPoiUtil.importExcel(filePath,0,1,SzkDemo.class);
        long b=System.currentTimeMillis();
        logger.info("解析excel耗时："+(b-a)/1000+"m");
        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
        szkService.saveDataBatch(list);
        long c=System.currentTimeMillis();
        logger.info("写入数据库耗时："+(c-b)/1000+"m");
        System.out.println("导入数据一共【"+list.size()+"】行");
    }
}
