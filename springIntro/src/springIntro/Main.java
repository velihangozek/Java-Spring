package springIntro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// CustomerManager customerManager = new CustomerManager();
		// CustomerManager customerManager = new CustomerManager(new CustomerDal());
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
				
		
		
		// 	Reading the "new CustomerDal()" from context
		//	CustomerManager customerManager = 
		//		new CustomerManager(context.getBean("database", ICustomerDal.class));
		
//		CustomerManager customerManager2 = 
//				new CustomerManager(new MySqlCustomerDal());
		// customerManager.add();
		customerService.add();
//		customerManager2.add();

	}

}
