package List;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class M3
{
	static class A
	{
		int i;
		A(int i)
		{
			this.i=i;
		}
		public String toString()
		{
			return "i= " +i;
		}
	}
	public static void main(String[] args) 
	{	
		LinkedList list=new LinkedList();
		list.add(new A(20));
		list.add(new A(50));
		list.add(new A(30));
		list.add(new A(80));
		list.add(new A(10));
		System.out.println(list);
		Collections.sort(list,new Comparator<A>()
				{
					public int compare(A obj1,A obj2)
					{
						return obj1.i - obj2.i;
					}
				});
		System.out.println(list);
	}

}
