package daysix;

public class HierarchicalInDemo {
	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println("-------Person Details------");
		System.out.println(p1);
		Person p;
		p=new Person("Manju","dubai");
		if(p instanceof Person)
			System.out.println("Person Details"+p);
		
		p=new Employee("lakshmi","channi",101,67000,"Sales");
		if(p instanceof Employee)
			System.out.println("Employee Details"+p);
		
		p=new Student1("Manju","dubai","FE",88);
		if(p instanceof Student1)
			System.out.println("Student1 Details"+p);
		
	}

}
