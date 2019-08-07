package xyz.xkrivzooh.spring.xml.core.schema;

import org.w3c.dom.Element;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;

//通常为每一个xsd:element都要注册一个BeanDefinitionParser
public class PersonBeanDefinitionParser implements BeanDefinitionParser {

	private final Class<?> beanClass;

	public PersonBeanDefinitionParser(Class<?> beanClass) {
		this.beanClass = beanClass;
	}


	public BeanDefinition parse(Element element, ParserContext parserContext) {
		RootBeanDefinition beanDefinition = new RootBeanDefinition();
		beanDefinition.setBeanClass(beanClass);
		beanDefinition.setLazyInit(false);
		beanDefinition.getPropertyValues().add("name", element.getAttribute("name"));
		beanDefinition.getPropertyValues().add("age", element.getAttribute("age"));
		BeanDefinitionRegistry beanDefinitionRegistry = parserContext.getRegistry();
		beanDefinitionRegistry.registerBeanDefinition(beanClass.getName(),beanDefinition);
		return beanDefinition;
	}
}
