package Set;

import java.util.ArrayList;
import java.util.Collections;

public class M7 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
