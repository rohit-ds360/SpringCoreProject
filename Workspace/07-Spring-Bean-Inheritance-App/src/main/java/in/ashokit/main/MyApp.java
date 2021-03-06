package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Mobile;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Mobile mobile = context.getBean("mobile",Mobile.class);
		System.out.println(mobile);
		
		Mobile mobile1 = context.getBean("mobile1",Mobile.class);
		System.out.println(mobile1);
		
		Mobile mobile2 = context.getBean("mobile2",Mobile.class);
		System.out.println(mobile2);
	}

}
