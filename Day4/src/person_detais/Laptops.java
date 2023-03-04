package person_detais;

abstract class Laptops {
	abstract void weiht();
	abstract void model();
	abstract void speed();
	abstract void cost();
	abstract void display();
	

}
 class Child extends Laptops{
	 
		 void weiht()
		 {
			 System.out.println("should be less");
			 
		 }
		 void model(){
			 System.out.println("mnk");
		 }
		 void speed(){
			 System.out.println("less 75km");
		 }
		 void cost(){
			 System.out.println("97000");
		 }
		 void display(){
			 System.out.println("clear");
		 
	 }

	 public static void main(String[] args) {
		Child obj=new Child();
		obj.cost();
		obj.display();
		obj.model();
		obj.speed();
		obj.weiht();
		
	}
}
