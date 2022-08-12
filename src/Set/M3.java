package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class M3
{
	static class A implements Comparable<A>
	{
		int i;
		A(int i)
		{
			this.i=i;
		}
		public String toString()
		{
			return "" +i;
		}
		public  int compareTo(A o1)
		{
			return i - o1.i;
		}
	}
	public static void main(String[] args) {
		
		TreeSet set=new TreeSet();
		set.add(new A(19));
		set.add(new A(10));
		set.add(new A(112));
		set.add(new A(13));
		System.out.println(set);
		
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+ " ");
		}
		
	}
}
