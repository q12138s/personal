package com.feicui.utils;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class UploadUtils {
	public static String upload(MultipartFile file){
		//访问路径
		String fwPath = "images/";
		String filename = "";
		try {
			//定义上传的位置
			String path = "D:/tbworkplace/bookshopping/WebContent/images/";
			File filePath = new File(path);
			//判断上传的位置是否存在
			if(!filePath.exists()){
				//创建当前目录
//				filePath.mkdir();
				//创建当前目录以及父目录
				filePath.mkdirs();
			}
			//获取上传文件的真实名称
			filename = file.getOriginalFilename();
			
			//获取上传文件的后缀名
			filename = filename.substring(filename.lastIndexOf('.'));
			System.out.println(filename);
			
			//aa.txt
			
			//上传文件新的名称
			filename = UUIDUtils.getUUID() + filename;
			
			path = path + filename;
			file.transferTo(new File(path));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fwPath + filename;
	}
}
