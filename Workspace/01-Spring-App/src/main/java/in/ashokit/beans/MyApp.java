package in.ashokit.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyApp {

	public static void main(String[] args) {
		
		//Loading bean configuration file
		Resource resource = new ClassPathResource("Beans.xml");
		
		//starting IOC container
		BeanFactory factory = new XmlBeanFactory(resource);
		
		//Getting target bean object
		PaymentProcessor processor = 
				factory.getBean("paymentProcessor", PaymentProcessor.class);
		
		//Calling target bean method
		processor.doPayment(1400.00);
	}
	
}
