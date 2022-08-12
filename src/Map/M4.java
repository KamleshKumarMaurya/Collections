package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class M4
{
	static class A implements Comparable<A>
	{
		int i,j;
		A(int i,int j)
		{
			this.i=i;
			this.j=j;
		}
		public String toString()
		{
			return "(" +i+ ", " +j+ ")";
		}
		public int compareTo(A o1)
		{
			return j - o1.j;
		}
	}
	public static void main(String[] args) 
	{	
		TreeMap map1=new TreeMap();
		map1.put(new A(12,9),"abc");
		map1.put(new A(14,2),"abc");
		map1.put(new A(16,4),"abc");
		map1.put(new A(17,7),"abc");
		map1.put(new A(10,8),"abc");
		System.out.println(map1);
	}

}
