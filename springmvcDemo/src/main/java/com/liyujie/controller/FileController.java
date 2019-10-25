package com.liyujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/file")
public class FileController {
//    定义上传的路径为G盘根目录
    private static String uploadPath="G:"+File.separator;
    @RequestMapping("/upload")
    /*
    @RequestParam("file")指定入参，入参就代表上传的文件。里面的值与前台页面的表单的name值一致
     */
    public String upload(@RequestParam("file") MultipartFile multipartFile, Model model){
    //1.传到哪里去，2.我传的什么东西，3.传的细节。
        //1.判断文件是否为空
        if (multipartFile!=null&&!multipartFile.isEmpty()){
            //不空才传，
            //2.获取原始文件名。
            String originalFilename = multipartFile.getOriginalFilename();
            System.out.println(originalFilename.toString());
//           3. 获取文件的文件名前缀，不带后缀
            String filePrefix=originalFilename.substring(0,originalFilename.lastIndexOf("."));
//            4.加工处理文件名，将原文件名+时间戳
            String newFileNamePrefix=filePrefix+new Date().getTime();
//            5.得到新文件名
            String newFileName=newFileNamePrefix+originalFilename.substring(originalFilename.lastIndexOf("."));
//            6.构建文件对象
            File file=new File(uploadPath+newFileName);
//            7.文件上传
            try {
                multipartFile.transferTo(file);
                model.addAttribute("filename",newFileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "uploadSuc";
    }
//    多个文件上传用数组就行了
    @RequestMapping("/upload2")
    public String upload2(@RequestParam("file")MultipartFile[] multipartFiles,Model model){
        List<String> fileList=new ArrayList<>();
        if (multipartFiles!=null&&multipartFiles.length>0){
                for (MultipartFile multipartFile1:multipartFiles){
                    String originalFilename = multipartFile1.getOriginalFilename();
                    String fileNamePrefix = originalFilename.substring(0, originalFilename.lastIndexOf("."));
                    String newFilePrefix=fileNamePrefix+new Date().getTime();
                    String newFileName=newFilePrefix+originalFilename.substring(originalFilename.lastIndexOf("."));
                    File file=new File(uploadPath+newFileName);
                    try {
                        multipartFile1.transferTo(file);
                        fileList.add(newFileName);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            model.addAttribute("filelist",fileList);
        }
    return "uploadSuc2";
    }
}
