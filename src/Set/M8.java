package Set;

import java.util.Collections;
import java.util.TreeSet;

public class M8 
{
	public static void main(String[] args) 
	{
		TreeSet set = new TreeSet(Collections.reverseOrder());
		set.add(90);
		set.add(910);
		set.add(100);
		System.out.println(set);
		
	}

}
