package co.edureka.component;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Hello {
public void sayHello(){
	System.out.println("welcome to hello program");
}
@PreDestroy
public void destroy(){
	System.out.println("in destroy method");
}
}
