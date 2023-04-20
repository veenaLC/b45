package daytwelev;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StackAppp {
	void Display(List<String>List) {
		Iterator<String> obj=List.iterator();
		while(obj.hasNext()){
			System.out.println("Elemets are: "+obj.next());
		}
	}
	public static void main(String[] args) {
		List<String> obj1=new LinkedList<>();
		obj1.add("veena");
		obj1.add("manju");
		obj1.add("shivu");
		obj1.add("chandru");
		
		StackAppp app=new StackAppp();
		app.Display(obj1);
	}

}
