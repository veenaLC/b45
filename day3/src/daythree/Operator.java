package daythree;

public class Operator {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		System.out.println("a and b value before the operation: "+ a + " " + b);
		++a;         // a=11+1
		
		int c=++a + b + a--; //12+20+12=44
		System.out.println("c value after the operation: "+ c);
		
		int d=c++ + a +b--;//44+ 11+20=75
		System.out.println("d value afte the operation: "+ d);
		System.out.println("a, d, c, d value the operation: " + a + " " + c + " " + d);
		x=(10==x) ? 1:0;
		System.out.println(x);
		
		
	}

}
