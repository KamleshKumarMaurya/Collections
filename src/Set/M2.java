package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class M2
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
			return " " +i;
		}
	}
	public static void main(String[] args) {
		
		LinkedHashSet set=new LinkedHashSet();//it maintain insertion order
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
