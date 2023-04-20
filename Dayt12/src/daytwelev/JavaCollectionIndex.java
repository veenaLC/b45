package daytwelev;

import java.util.LinkedList;
import java.util.List;

public class JavaCollectionIndex {
	public static void main(String[] args) {
		List<String> obj1=new LinkedList<>();
		obj1.add("shivu");
		obj1.add("manju");
		obj1.add("veena");
		obj1.add("chandu");
		
		System.out.println(obj1);
		System.out.println(obj1.indexOf("manju"));
	}

}
