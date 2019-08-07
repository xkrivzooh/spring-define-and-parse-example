package xyz.xkrivzooh.spring.xml.demo;

import xyz.xkrivzooh.spring.xml.core.pojo.Person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("person-demo.xml");

		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);//Person{name='name1', age=1}
	}
}
