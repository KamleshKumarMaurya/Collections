package List;

import java.util.ArrayList;
import java.util.Iterator;

public class M1 
{
	static class A
	{
		String i;
		int j;
		A(String i, int j)
		{
			this.i=i;
			this.j=j;
		}
		public String toString()
		{
			return "index = "+i+ ", value= " +j;
		}
	}
	public static void main(String[] args)
	{
		ArrayList<A> list = new ArrayList<A>();
		list.add(new A("ABC",50));
		list.add(new A("XYZ",80));
		list.add(new A("lara",100));
		list.stream().forEach(System.out::println);
//		Iterator it=list.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
	}

}
