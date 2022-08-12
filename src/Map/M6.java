package Map;

import java.util.TreeMap;

public class M6
{
	static class A
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
	}
	public static void main(String[] args) 
	{	
		TreeMap map1=new TreeMap<>((A o1,A o2) -> o1.i - o2.i);
		map1.put(new A(12,9),"abc");
		map1.put(new A(14,2),"abc");
		map1.put(new A(16,4),"abc");
		map1.put(new A(17,7),"abc");
		map1.put(new A(10,8),"abc");
		System.out.println(map1);
	}

}
