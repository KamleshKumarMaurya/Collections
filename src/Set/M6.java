package Set;

import java.util.Arrays;
import java.util.Collections;

public class M6 
{
	static class D implements Comparable
	{
		int i;
		D(int i)
		{
			this.i=i;
		}
		public String toString()
		{
			return "i= " +i;
		}
		public int compareTo(Object obj)
		{
			return i- ((D)obj).i;
		}
		
	}
	public static void main(String[] args) 
	{
		D[] array = {new D(10), new D(20),new D(50),new D(110),new D(5)};
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}
}
