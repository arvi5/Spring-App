package co.edureka.component;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("dummy.xml");
		Hello hello = (Hello) context.getBean("hello");
		hello.sayHello();
		context.close();
		
	}

}
