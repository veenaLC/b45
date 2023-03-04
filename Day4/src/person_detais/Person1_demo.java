package person_detais;

import java.util.Scanner;

public class Person1_demo {
	public static void main(String[] args) {
		Person1 p1=new Person1();
		Scanner sc=new Scanner(System.in);
		String name,City;
		int age;
		System.out.println("enter person details : name, age and city");
		name=sc.nextLine();
		age=sc.nextInt();
		City=sc.nextLine();
		 
		p1.setPersonName(name);p1.setPersonAge(age);p1.setPersonCity(City);
		System.out.println("person Details name : "+p1.getPersonName()+"\tAge :"+p1.getPersonAge()+"\tCity :"+p1.getPersonCity());
		
		System.out.println("enter personDetails : name, age and city");
		name=sc.nextLine();
		age=sc.nextInt();
		City=sc.nextLine();
		p1=new Person1(name, age, City);
		System.out.println("person Details name : "+p1.getPersonName()+"\tAge :"+p1.getPersonAge()+"\tCity :"+p1.getPersonCity());
		sc.close();
	}

}
