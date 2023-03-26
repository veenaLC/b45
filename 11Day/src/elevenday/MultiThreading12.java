package elevenday;

class Eclipse extends Thread{
	public void run(){
		System.out.println("Eclipse Thread ID is "+Thread.currentThread().getId());
	}
}
class Sketchnook extends Thread{
	public void run(){
		System.out.println("Sketchnook Thread ID is "+Thread.currentThread().getId());
	}
}
class Chrome extends Thread{
	public void run(){
		System.out.println("Chrome Thread ID is "+Thread.currentThread().getId());
	}
}

public class MultiThreading12 {
	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
		obj.start();
		
		Sketchnook obj1=new Sketchnook();
		obj1.start();
		Chrome obj2=new Chrome();
		obj2.start();
		
		for(int i=0;i<5;i++){
			System.out.println("Main Thread ID is "+Thread.currentThread().getId());
		}
	}

}
