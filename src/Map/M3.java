package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

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
			return "(" +i+")";
		}
		public int compareTo(A o1)
		{
			return i - o1.i;
		}
	}
	public static void main(String[] args) 
	{	
		HashMap map1=new HashMap();
		map1.put(new A(12),"abc");
		map1.put(new A(14),"abc");
		map1.put(new A(16),"abc");
		map1.put(new A(17),"abc");
		map1.put(new A(10),"abc");
		System.out.println(map1);
		TreeMap map2=new TreeMap();
		map2.putAll(map1);
		System.out.println(map2);
	}

}
