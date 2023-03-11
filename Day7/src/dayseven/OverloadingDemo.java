package dayseven;

public class OverloadingDemo {
	public void m1(int a,String b){
		System.out.println("firstprogram");
	}
	public void m1(String r,int s){
		System.out.println("secoddprogram");
	}
	public static void main(String[] args) {
		OverloadingDemo h=new OverloadingDemo();
		h.m1(12,"veena");
		h.m1("ammu", 34);
	}

}
