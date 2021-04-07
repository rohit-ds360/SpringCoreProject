package in.ashokit.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//Resource resource  = new ClassPathResource("Beans.xml");
		
		//Lazy loading mechanism
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		/*
		 * GenericApplicationContext context = new GenericApplicationContext();
		 * XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(context);
		 * reader.loadBeanDefinitions(resource); context.refresh();
		 */
		
		//Eager loading mechanism
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		
		MessageWriter bean = context.getBean("msgWriter",MessageWriter.class);
		
		bean.formatMsg("Welcome to Ashok It....");
		
	

	}

}
