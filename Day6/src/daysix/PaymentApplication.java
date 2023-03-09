package daysix;

interface worldBank{
	float rateofIntrest();
}

interface RBI{
	float RBI_rateofIntrest();
}

public class PaymentApplication implements worldBank,RBI {
	public float rateofIntrest(){
		return 9.0f;
	}
	public float RBI_rateofIntrest(){
		return 9.1f;
	}
	public static void main(String[] args) {
		worldBank obj=new PaymentApplication();
		RBI obj2=new PaymentApplication();
		
		System.out.println(obj.rateofIntrest());
		System.out.println(obj2.RBI_rateofIntrest());
	}

}
