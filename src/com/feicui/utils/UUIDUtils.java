package com.feicui.utils;

import java.util.UUID;

/**
 * ���ɼ�����Ĺ�����
 * @author Administrator
 *
 */
public class UUIDUtils {
	
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}
}
