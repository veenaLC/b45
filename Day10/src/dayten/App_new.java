package dayten;

public class App_new {
	void validate(int age){
		if (age<18){
			throw new ArithmeticException("cause theor age is less");
		}
		else{
			System.out.println("they are eligible");
		}
	}
	public static void main(String[] args) {
		App_new obj=new App_new();
		obj.validate(19);
	}

}
