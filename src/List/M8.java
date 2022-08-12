package List;

import java.util.ArrayList;
import java.util.Iterator;

public class M8
{
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(90);
		list.add(910);
		list.add(19);
		list.add(10);
		Iterator it=list.iterator();
		Object obj;
		while(it.hasNext())
		{
			obj=it.next();
			System.out.println(obj);
			if(obj.equals(19))
			{
				it.remove();
			}
		}
		System.out.println(list);
	}

}
