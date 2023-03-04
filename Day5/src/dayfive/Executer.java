package dayfive;


public class Executer {
	public static void main(String[] args) {
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		b1.varDefault=11;
		b1.methodDefault();
		 
		
		// private member can't accessible
		/*b1.varprivate=21;
		b1.methodPrivate();*/
		
		b1.varProtected=31;
		b1.methodProtected();
		
		b1.varpublic=41;
		b1.methodPublic();
		
		System.out.println(b1 instanceof Base);//returns true
	}

}

