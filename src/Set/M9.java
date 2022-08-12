package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class M9 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(10);
		set.add(3);
		set.add(300);
		set.add(100);
		set.add(20);
		System.out.println(set);
		TreeSet set1 = new TreeSet(set);
		System.out.println(set1);
		TreeSet set2 = new TreeSet(Collections.reverseOrder());
		set2.addAll(set);
		System.out.println(set2);
	}
	

}
