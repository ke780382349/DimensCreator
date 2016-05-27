package com.kz.dimencreator.util;

public class KLog {
	public static void i(Object obj){
		if(obj==null){
			i("null obj!");
			return ;
		}
		System.out.println(obj.toString());
	}
}
