package com.feicui.utils;

import java.util.UUID;

/**
 * 生成激活码的工具类
 * @author Administrator
 *
 */
public class UUIDUtils {
	
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}
}
