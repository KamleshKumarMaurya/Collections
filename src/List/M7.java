package List;

import java.util.ArrayList;
import java.util.Iterator;

public class M7
{
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(90);
		list.add(910);
		list.add(19);
		list.add(10);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(list);
	}

}
