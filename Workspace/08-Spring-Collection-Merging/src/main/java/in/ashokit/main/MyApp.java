package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Meeting;

public class MyApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Meeting scrum = context.getBean("sm",Meeting.class);
		
		System.out.println(scrum);
		
		Meeting functional = context.getBean("fm",Meeting.class);
		
		System.out.println(functional);
		
		Meeting triage = context.getBean("tm",Meeting.class);
		
		System.out.println(triage);

	}

}
