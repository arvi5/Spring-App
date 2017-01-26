package co.edureka.autowiring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

@SuppressWarnings("resource")
public class Testing {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);

	}

}
