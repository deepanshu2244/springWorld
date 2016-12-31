package com.local.spring.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.local.spring.bean.UnitedArabEmirates;

public class TestSpringAutowireClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		UnitedArabEmirates uaeObje = (UnitedArabEmirates)context.getBean(UnitedArabEmirates.class);
		
		System.out.println(uaeObje.toString());
		

	}

}
