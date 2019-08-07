package xyz.xkrivzooh.spring.xml.core.schema;

import xyz.xkrivzooh.spring.xml.core.pojo.Person;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class PersonNamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		registerBeanDefinitionParser("person", new PersonBeanDefinitionParser(Person.class));
	}
}
