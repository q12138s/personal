package com.feicui.test;

import com.feicui.utils.MailUtils;

public class Test {
	
	public static void main(String[] args) throws Exception {
		String code = "���<a href = 'http://localhost:8080/bookshopping/showIndex.action'>�˴�</a>�����˻�";
		MailUtils.sendMail("shuai02@163.com", code);
		
		System.out.println("�ʼ��ѷ���");
	}
}
