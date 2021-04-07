package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Company;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Company bean = context.getBean("company",Company.class);
		
		System.out.println(bean.getProjects().getClass().getName());
		
		System.out.println(bean.getManagers().getClass().getName());
		
		System.out.println(bean.getSalaries().getClass().getName());
		
		System.out.println(bean);
	}

}
