package springIntro;

// Spaghetti Code

//public class CustomerDal {
//		public void add(int type) {
//			if (type == 1) {
//		System.out.println("Added to Oracle Database!");
//	} else {
//		System.out.println("Added to MySQL Database!");
//	}
//	}	
//}

// Proper Code

public class CustomerDal implements ICustomerDal{
	String connectionString;
	// Getter
	public String getConnectionString() {
		return connectionString;
	}
	// Setter
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		System.out.println("Connection String : " + this.connectionString);
		System.out.println("Added to Oracle Database!"); // Oracle Codes.
	}
}
