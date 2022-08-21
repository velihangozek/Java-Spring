package springIntro;

public class MsSqlCustomerDal implements ICustomerDal{
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
		System.out.println("Added to MsSQL Database!");
	}
}
