package es.jripoll.ioc.annotationconfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class IocAnnotationConfigApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Company company = context.getBean("company", Company.class);
		System.out.println("### A Company ###");
		System.out.println("Street: " + company.getAddress().getStreet());
		System.out.println("Number: " + company.getAddress().getNumber());
	}
}
