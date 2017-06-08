package com.other.wechat.httpclient;

public class Test {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<500;i++){
			sb.append("时");
		}
		System.out.println(sb.toString());
		System.out.println(sb.length());
	}
}
