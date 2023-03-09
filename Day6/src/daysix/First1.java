package daysix;

class First1 {
	
	void disp(){
		System.out.println("i am first parent class");
	}
	
	class second1{
		void disp(){
			System.out.println("i am from second class");
		}
		class third extends First1.second1{
			void disp(){
				System.out.println("i am from third class");
			}
		}
	}
	public static void main(String[] args) {
		
	}

}
