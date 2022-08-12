package List;

import java.util.ArrayList;
import java.util.List;

public class DemoAll {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//list allow to add duplicate elements
//		list.add("abc");
//		list.add("abc");
//		list.add("xyz");
//		list.add("xyz");
//		System.out.println(list);
//		
//		//list allow to add null values
//		list.add(null);
//		list.add(null);
//		System.out.println(list);
		
		//insertion order
		list.add("elemen1");
		list.add("elemen2");
		list.add("elemen4");
		list.add("elemen3");
		list.add("elemen5");
		System.out.println(list);
		
		//access elements from list
		System.out.println(list.get(0));
		System.out.println(list.get(3));
	}

}
