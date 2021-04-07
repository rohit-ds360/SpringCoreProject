package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		
		//find XML
		Resource r = new ClassPathResource("resources/spring.xml");
		//Load XML into container
		BeanFactory factory = new XmlBeanFactory(r);
		//create Test class object
		Object o = factory.getBean("t");
		Test t = (Test)o;
		t.hello();

	}

}
