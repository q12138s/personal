package com.feicui.utils;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

/**
 * �����ʼ��Ĺ�����
 * @author Administrator
 *
 */
public class MailUtils {
	/***
	 * �����ʼ��ķ���
	 * @param toMail		�ռ���
	 * @param code			������
	 */
	public static void sendMail(String toMail,String code)throws Exception{
		//�����ʼ�������
		Properties props =  new Properties();
		//���ʼ�������������
		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("user2@book.com", "123");
			}
		});
		//�����ʼ�
		Message message = new MimeMessage(session);
		//���÷�����
		message.setFrom(new InternetAddress("user2@book.com"));
		//�����ռ���
		message.setRecipient(RecipientType.TO, new InternetAddress(toMail));
		//�����ʼ�������
		message.setSubject("����ͼ���̳ǵ��ʼ�");
		//�����ʼ�������
		String msg = "<h1>���<a href = 'http://localhost:8080/bookshopping/activation.action?code="+code+"'>�˴������˻�</a></h1>";
		message.setContent(msg, "text/html;charset=utf-8");
		
		//�����ʼ�
		Transport.send(message);
	}
}
