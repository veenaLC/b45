package person_detais;

import java.util.Scanner;

public class Person_demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("enter person name");
		name=sc.next();
		System.out.println("enter age:");
		int age=sc.nextInt();
		System.out.println("enter gender:");
		String gender=sc.next();
		System.out.println("enter taxable income:");
		int income=sc.nextInt();
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		System.out.println(person);
		Taxcalculation ca=new Taxcalculation();
		ca.calculatetax(person);
		System.out.println("after calculation tax:");
		System.out.println(person);
		
		
	}

}
