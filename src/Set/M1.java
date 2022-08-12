package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class M1 
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
			return i+"";
		}
	}
	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add(new A(19));
		set.add(new A(10));
		set.add(new A(112));
		set.add(new A(13));
		System.out.println(set);
		
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
		
	}
}
