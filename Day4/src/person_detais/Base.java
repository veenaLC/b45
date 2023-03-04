package person_detais;

public class Base {
	
	int varDefault=10;
	public int varPublic=20;
	private int  varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault(){
		System.out.println("default access Base class");
		System.out.println("Default variable :" +varDefault);
	}
	
	
	public void methodPublic(){
		System.out.println("public access Base class");
		System.out.println("public variable : "+varPublic);
		
	}
	private void methodPrivate()
	{
		System.out.println("private access Base class");
		System.out.println("private variable :"+varPrivate);
	}
	protected void methodProtected(){
		System.out.println("protected access Base class");
		System.out.println("private variable : "+varProtected);
	}
	

}
