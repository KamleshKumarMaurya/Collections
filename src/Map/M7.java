package Map;

import java.util.HashMap;

public class M7
{
	static class A 
	{
		String s1;
		A(String s1)
		{
			this.s1=s1;
		}
		public String toString()
		{
			return " " +s1 ;
		}
		
	}
	public static void main(String[] args)
	{	
		HashMap map1=new HashMap();
		map1.put(new A("abc"), 14);
		map1.put(new A("xyz"), 32);
		map1.put(new A("lara"), 52);
		map1.put(new A("bca"), 52);
		map1.put(new A("hello"), 52);
		System.out.println(map1);
	}

}
