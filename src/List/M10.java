package List;

import java.util.ArrayList;
import java.util.Iterator;

public class M10
{
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(90);
		list.add(910);
		list.add(19);
		list.add(10);
		Iterator it=list.iterator();
		//list.add(1000);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		list.add(1900);
		System.out.println("------");
		System.out.println(list);
	}

}
