package dayten;

import java.io.IOException;

public class Hello_app {
	void m1(){
		//veena
		System.out.println("no Ecception in this method");
	}
	//megha
	void m2() throws IOException{
		System.out.println("Device Error");
	}
	//gayi
	void m3() throws ArithmeticException{
		System.out.println("Arithmetic exception may be happen");
		int a=50/0;
	}
	public static void main(String[] args) {
		
	}
	

}
