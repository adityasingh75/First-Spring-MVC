package com.spring.FirstSpringMaven;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		//ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		
		//XmlBeanFactory ctx=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		
		ApplicationContext ctx= new FileSystemXmlApplicationContext("src/main/java/beans.xml");
		
		Student student=(Student)ctx.getBean("id");
		System.out.println(student.getId());
		System.out.println(student.getName());
	}
}