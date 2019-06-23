package com.feicui.test;

import com.feicui.utils.MailUtils;

public class Test {
	
	public static void main(String[] args) throws Exception {
		String code = "点击<a href = 'http://localhost:8080/bookshopping/showIndex.action'>此处</a>激活账户";
		MailUtils.sendMail("shuai02@163.com", code);
		
		System.out.println("邮件已发送");
	}
}
