package com.hu81;

import com.hu81.controller.WelcomeController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@Configuration
@ComponentScan("com.hu81")
public class Test {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Jackie\\Projects\\Research\\spring\\spring-framework\\spring-jtesting\\src\\main\\resources\\ApplicationContext.xml");
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println("---------------- " + beanName);
		}
		WelcomeController welcomeController = (WelcomeController) context.getBean("welcomeController");
		System.out.println(welcomeController.sayHi("81"));
	}

	public static void main1(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println("---------------- " + beanName);
		}
		WelcomeController welcomeController = (WelcomeController) context.getBean("welcomeController");
		System.out.println(welcomeController.sayHi("81"));
	}

}
