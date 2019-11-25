package es.jripoll.ioc.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class AppConfiguration {

    @Bean
    public Address address() {
        return new Address("Gran vía", 28);
    }
}



/*@Bean
    public Company company() {
        return new Company(getAddress());
    }*/
