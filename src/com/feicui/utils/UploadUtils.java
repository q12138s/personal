package com.feicui.utils;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class UploadUtils {
	public static String upload(MultipartFile file){
		//����·��
		String fwPath = "images/";
		String filename = "";
		try {
			//�����ϴ���λ��
			String path = "D:/tbworkplace/bookshopping/WebContent/images/";
			File filePath = new File(path);
			//�ж��ϴ���λ���Ƿ����
			if(!filePath.exists()){
				//������ǰĿ¼
//				filePath.mkdir();
				//������ǰĿ¼�Լ���Ŀ¼
				filePath.mkdirs();
			}
			//��ȡ�ϴ��ļ�����ʵ����
			filename = file.getOriginalFilename();
			
			//��ȡ�ϴ��ļ��ĺ�׺��
			filename = filename.substring(filename.lastIndexOf('.'));
			System.out.println(filename);
			
			//aa.txt
			
			//�ϴ��ļ��µ�����
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
