package Set;

import java.util.HashSet;

public class M5 
{
	static class A
	{
		int i,j,k;
		A(int i,int j,int k)
		{
			this.i=i;
			this.j=j;
			this.k=k;
		}
		public String toString()
		{
			return "("+i+", "+j+", "+k+ ")";
		}
		public int hashCode()
		{
			return Integer.toString(i).hashCode() + Integer.toString(j).hashCode() + Integer.toString(k).hashCode();
		}
		public boolean equals(Object obj)
		{
			return (i == ((A)obj).i) && (j == ((A)obj).j) && (k == ((A)obj).k);
		}
	}
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(new A(10,20,30));
		set.add(new A(10,20,30));
		set.add(new A(10,40,30));
		set.add(new A(10,50,30));
		System.out.println(set);
	}

}
