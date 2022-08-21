package com.springdemo;

// Spaghetti Code

//public class CustomerManager {
//	
//	public void add() {
//		//business rules - iş kuralları
//		CustomerDal customerDal = new CustomerDal();
//		customerDal.add(1);
//		customerDal.add(2);
//	}
//
//}

// Proper Code

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
// 	Setter Injection
//	public void setCustomerDal(ICustomerDal customerDal) {
//	this.customerDal = customerDal;
//	}
	
//  Constructor Injection
	public CustomerManager(ICustomerDal customerDal) {
//		// super();
		this.customerDal = customerDal;
	}

	public void add() {
		// Business Rules - İş Kurallarını yazdığımızı varsay.
		// CustomerDal customerDal = new CustomerDal();
		customerDal.add();
	}
}
