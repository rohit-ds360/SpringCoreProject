package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Car;

public class MyApp {    

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Car carBean1 = context.getBean("car",Car.class);
		
		System.out.println(carBean1.hashCode());
		
		Car carBean2 = context.getBean("car",Car.class);
		System.out.println(carBean2.hashCode());
		
		System.out.println("Application Terminated");

	}

}
