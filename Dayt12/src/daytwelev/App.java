package daytwelev;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {
	void Display(List<String> List) {
		ListIterator<String> obj=List.listIterator();
		while(obj.hasNext()) {
			System.out.println("Element is: "+obj.next());
		}
	}
	public static void main(String[] args) {
		List<String> obj1=new LinkedList<>();
		obj1.add("veena");
		obj1.add("komal");
		obj1.add("manju");
		App obj3=new App();
		obj3.Display(obj1);
	}

}
