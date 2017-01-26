package com.edureka.beaninheritance;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beansInherit.xml");
		Ebook obj = (Ebook) context.getBean("ebook");
		System.out.println(obj.toString());
		context.close();
	}

}
