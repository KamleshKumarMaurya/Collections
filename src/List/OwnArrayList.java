package List;

import java.util.ArrayList;
//ArrayList develop for avoiding duplicate
public class OwnArrayList extends ArrayList{
	
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}else {
			return super.add(o);
		}
	}
	public static void main(String[] args) {
		OwnArrayList list = new OwnArrayList();
		list.add("hello");
		list.add("lara");
		list.add("hello");
		list.add("xyz");
		System.out.println(list);
	}

}
