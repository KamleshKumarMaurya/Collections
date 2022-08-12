package List;

import java.util.Collections;
import java.util.LinkedList;

public class M4
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
		Collections.sort(list,(A o1,A o2) -> o1.i - o2.i);
		System.out.println(list);
	}

}
