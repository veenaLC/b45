package dayten;

public class Student {
	void validate(int parent_income){
		if(parent_income<5){
			System.out.println("they are eligible");
			}else{
				System.out.println("they are not eligible");
			}
		}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.validate(6);
	}

}
