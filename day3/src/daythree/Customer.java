package daythree;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	//default constructor
	public Customer(){
		System.out.println("Default constructor");
		
	}
	
	//parameterised constructor
	public Customer(String customerName,int custopmerId,String customerCity, int customerId){
		System.out.println("parameterised constructor");
		this.customerName=customerName;
		this.customerId=customerId;
		this.customerCity=customerCity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + ",getCustomerCity()="+getCustomerCity()+",getCustomerId()="+getCustomerId()+"getCustomerNAme()="+getCustomerName()+"]";
		
	}
	
	

}
