package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(); // Config can be refreshed by adding
		   												  // "IocConfig.class" as a parameter(1st method)
		
		// Registering and refreshing config. (2nd method) If we don't specify the config file by 
		// registering it --> NoSuchBeanDefinitionException error.
			
		context.register(IocConfig.class); // --> To specify the config file. 
		context.refresh(); // --> Need to explicitly refresh the config file after registering.
		
		// (3rd method)
		// AnnotationConfigApplicationContext context = 
		//		new AnnotationConfigApplicationContext("com.springdemo"); --> Specifying the package name
		
		// CustomerManager customerManager = new CustomerManager();
		// CustomerManager customerManager = new CustomerManager(new CustomerDal());
		
		
//		 ICustomerDal customerDal
//		 	= context.getBean("database", ICustomerDal.class);
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
//		customerDal.add();
		customerService.add();
	
		// 	Reading the "new CustomerDal()" from context
		//	CustomerManager customerManager = 
		//		new CustomerManager(context.getBean("database", ICustomerDal.class));
		
//		CustomerManager customerManager2 = 
//				new CustomerManager(new MySqlCustomerDal());
// 		customerManager.add();
//		customerManager2.add();

	}

}
