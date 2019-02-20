package com.example.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class ComponentApplicationMain {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ComponentApplicationMain.class, args);

		IUser userComponentImpl1 = (UserComponentImpl) context.getBean("userComponentImpl");
		System.out.println(userComponentImpl1.get());

		IUser userComponentImpl2 = (UserComponentImplWithParam) context.getBean("componentBeanId");
		System.out.println(userComponentImpl2.get());
		
		UserRepositoryImpl userRepositoryImpl1 = (UserRepositoryImpl) context.getBean("userRepositoryImpl");
        UserRepositoryImpl userRepositoryImpl2 = (UserRepositoryImpl) context.getBean("userRepositoryImpl");
        System.out.println("@Repository注解默认作用域为singleton，返回true： " + userRepositoryImpl1.equals(userRepositoryImpl2));


	}

}
