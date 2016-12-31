package com.local.spring.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.local.spring.bean.Company;

public class TestClass {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
//		HelloWorld obj = context.getBean(HelloWorld.class);
//		obj.sayHello();
//		context.close();
		
//		FileSystemXmlApplicationContext anothercontext = new FileSystemXmlApplicationContext("beans.xml");
//		Person Personobj = anothercontext.getBean(Person.class);
//		System.out.println(Personobj.toString());
//		anothercontext.close();
		
		Company obj = (Company)context.getBean("Company");
		System.out.println(obj.getPerson().toString());

	}

}
