package com.jnc.web.controller.userinfo;

import ch.qos.logback.core.util.FileUtil;
import cn.afterturn.easypoi.entity.vo.NormalExcelConstants;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.jnc.web.controller.base.BaseController;
import com.jnc.web.entity.userinfo.UserInfoEntity;
import com.jnc.web.model.demo.Person;
import com.jnc.web.model.userinfo.UserInfoDto;
import com.jnc.web.service.userinfo.IUserInfoService;
import com.jnc.web.util.EasyPoiUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.util.*;

/**
 * @version V0.1
 * @项目名称：demo
 * @类名称：UserController
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-04-24 16:58
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/userInfo")
public class UserInfoController extends BaseController{

    @Autowired
    private IUserInfoService userInfoService;

    @RequestMapping("/queryAllUser")
    public String queryAllUser()  {
//        UserInfoDto user=new UserInfoDto();
//        List<UserInfoEntity> userList=userInfoService.queryAllUser(user);
//        String string=JSONArray.toJSONString(userList);
        return "";
    }

    @RequestMapping("/easyPoiTest")
    public void easyPoiTest(HttpServletResponse response)  {
//        EasyPoiUtil.templateXls(new ArrayList<Person>(),"用户模板","用户信息",Person.class,"海贼王.xls",response);
        EasyPoiUtil.templateXlsx(new ArrayList<Person>(),"用户模板","用户信息",Person.class,"海贼王.xlsx",response);
//        easyPoiExport(response);//导出demo
//        easyPoiImport(response);//导入demo
    }

    private void easyPoiExport(HttpServletResponse response){
        //模拟从数据库获取需要导出的数据
        List<Person> personList = new ArrayList<>();
        long a = System.currentTimeMillis();    //开始时间
//        for (int i = 0; i < 200000; i++) {
//            Person person=new Person("路飞"+i,i%2+"",new Date());
//            personList.add(person);
//        }
        long b = System.currentTimeMillis();    //开始时间
        logger.info("构建对象时间："+(b-a)/1000+"m");

        //导出操作
        EasyPoiUtil.exportExcelXlsx(new ArrayList<Person>(),null,null,Person.class,"海贼王.xlsx",response);
        long c = System.currentTimeMillis();    //开始时间
        logger.info("导出时间："+(c-b)/1000+"m");
    }

    private void easyPoiImport(HttpServletResponse response){
        String filePath = "F:\\海贼王.xls";
        //解析excel，
        List<Person> personList = EasyPoiUtil.importExcel(filePath,1,1,Person.class);
        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
        System.out.println("导入数据一共【"+personList.size()+"】行");

    }


    private void poiTest() throws Exception{
        UserInfoDto user=new UserInfoDto();
        long startTime = System.currentTimeMillis();    //开始时间
        List<UserInfoEntity> userList=userInfoService.queryAllUser(user);
        String xlsFile = "E:/wlm.xlsx";        //输出文件
        //内存中只创建100个对象，写临时文件，当超过100条，就将内存中不用的对象释放。
        Workbook wb = new SXSSFWorkbook(1000);            //关键语句
        Sheet sheet = null;        //工作表对象
        Row nRow = null;        //行对象
        int rowNo = 0;        //总行号
        int pageRowNo = 0;    //页行号

        int limitSize=500000;
        String sheetName="经销商箱码";
        for (int i = 0; i < userList.size(); i++) {
            if(rowNo%limitSize==0){
                sheet = wb.createSheet(sheetName+rowNo/limitSize);//建立新的sheet对象
                sheet = wb.getSheetAt(rowNo/limitSize);        //动态指定当前的工作表
                pageRowNo = 0;        //每当新建了工作表就将当前工作表的行号重置为0
            }
            rowNo++;
            nRow = sheet.createRow(pageRowNo++);    //新建行对象
            Cell cel0 = nRow.createCell(0);
            cel0.setCellValue(userList.get(i).getMandt());
            Cell cel2 = nRow.createCell(1);
            cel2.setCellValue(userList.get(i).getKunnr());
            logger.info("第"+rowNo+"行");
        }

        long finishedTime = System.currentTimeMillis();    //处理完成时间
        System.out.println("finished execute  time: " + (finishedTime - startTime)/1000 + "m");

        FileOutputStream fOut = new FileOutputStream(xlsFile);
        wb.write(fOut);
        fOut.flush();        //刷新缓冲区
        fOut.close();

        long stopTime = System.currentTimeMillis();        //写文件时间
        System.out.println("write xlsx file time: " + (stopTime - startTime)/1000 + "m");
    }

}
