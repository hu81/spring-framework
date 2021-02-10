package com.hu81;

import com.hu81.controller.WelcomeController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

@Configuration
@ComponentScan("com.hu81")
public class Test {

	@Bean("messageSource")
	ResourceBundleMessageSource resourceBundleMessageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames(new String[] { "i18n" });
		return messageSource;
	}

	public static void main1(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Jackie\\Projects\\Research\\spring\\spring-framework\\spring-jtesting\\src\\main\\resources\\ApplicationContext.xml");
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println("---------------- " + beanName);
		}
		WelcomeController welcomeController = (WelcomeController) context.getBean("welcomeController");
		System.out.println(welcomeController.sayHi("81"));
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);

		System.out.println("Spring Default 1: " + context.getMessage("name", null, Locale.getDefault()));

		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println("---------------- " + beanName);
		}
		WelcomeController welcomeController = (WelcomeController) context.getBean("welcomeController");
		System.out.println(welcomeController.sayHi("81"));
	}

}
