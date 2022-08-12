package List;

import java.util.ArrayList;

public class M12 
{
	static class A extends Thread
	{
		ArrayList list;
		A(ArrayList list)
		{
			this.list=list;
		}
		public void run()
		{
			list.add("abc");
		}
	}
	static class B extends Thread
	{
		ArrayList list;
		B(ArrayList list)
		{
			this.list=list;
		}
		public void run()
		{
			Object obj1=list.get(0);
			System.out.println(obj1);
		}
	}
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list=new SynchronizedArrayList(list);
		A a1=new A(list);
		B b1=new B(list);
		a1.start();
		b1.start();
		
	}
}
