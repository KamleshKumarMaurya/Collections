package Set;

import java.util.HashSet;

public class M4 
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
			return "(i="+i+", j=" +j+ ")";
		}
		public int hashCode()
		{
			return Integer.toString(i).hashCode() + Integer.toString(j).hashCode();
		}
		public boolean equals(Object obj)
		{
			return (i == ((A)obj).i) && (j == ((A)obj).j);
		}	
	}
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add(new A(10,20));
		set.add(new A(10,20));
		set.add(new A(10,30));
		set.add(new A(10,40));
		System.out.println(set);
		
	}

}
