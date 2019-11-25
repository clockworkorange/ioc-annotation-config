package es.jripoll.ioc.annotationconfig;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IocAnnotationConfigApplicationTests {

	@Test
	void testBasicUsage() {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Company company = context.getBean("company", Company.class);

		assertEquals(company.getAddress().getStreet(), "Gran vía");
		assertEquals(company.getAddress().getNumber(), 28);

	}

}
