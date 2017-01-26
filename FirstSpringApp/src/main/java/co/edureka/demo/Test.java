package co.edureka.demo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		HelloWorld hello = context.getBean(HelloWorld.class);
		//HelloWorld hello = (HelloWorld)context.getBean("helloworld");
		hello.sayHello();
		User user = (User) context.getBean("user");
		System.out.println(user.getCar().toString());
		context.close();
	}
}
