package List;

import java.util.ArrayList;
import java.util.Collections;

public class M5 
{
	static class A implements Comparable<A>
	{
		String s1;
		A(String s1)
		{
			this.s1=s1;
		}
		public String toString()
		{
			return " " +s1;
		}
		public int compareTo(A o1)
		{
			return s1.compareTo(o1.s1);
		}
	}
	public static void main(String[] args) 
	{	
		ArrayList list=new ArrayList();
		list.add(new A("abc"));
		list.add(new A("lara"));
		list.add(new A("xyz"));
		list.add(new A("test"));
		list.add(new A("bca"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
}
}
