package com.liyujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/download")
public class DownloadController {

    //定义一个下载文件的目录
    public static String parentPath="G:"+ File.separator;
    @RequestMapping("/load")
    public String down(HttpServletResponse response){
//        对于response，则是指定输出内容的编码，同时，该设置会传递给浏览器，告诉浏览器输出内容所采用的编码
        response.setCharacterEncoding("UTF-8");//这里可以不定义也能正确的下载出正确的文件名称。
    //通过输出流写到我们的客户端，最后是浏览器。
        //1.获取文件下载名称。
        String fileName="天使之翼.mp4";
        //2.构建一个path对象，采用NIO
        Path path = Paths.get(parentPath, fileName);
        //3.判断它是否存在
        if (Files.exists(path)){
            //存在就下载
            //通过response设定它的响应类型
            //4.获取文件的后缀这里是不包含"."的，是从"."以后的即MP4
            String fileSuffix=fileName.substring(fileName.lastIndexOf(".")+1);
            //5.设置contentType类型,只有制定了它才能够下载。
            response.setContentType("application/"+fileSuffix);
            //6.添加头信息
            //ISO8859-1
            try {
                //这是http协议，下载必须要有他的。
                response.addHeader("Content-Disposition:","attachment;filename="+new String(fileName.getBytes("UTF-8"),"ISO8859-1"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            //7.通过path写出去就OK
            try {
                Files.copy(path,response.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "msg";
    }
}
