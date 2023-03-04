package dayfive;

public class Base {
	int varDefault=30;
	public int varpublic=40;
	private int varPrivate=50;
	protected int varProtected=60;
	
	
	void methodDefault(){
		System.out.println("default access Base class");
		System.out.println("Default variable :" +varDefault);
	}
	
	
	public void methodPublic(){
		System.out.println("public access Base class");
		System.out.println("public variable : "+varpublic);
		
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

	
