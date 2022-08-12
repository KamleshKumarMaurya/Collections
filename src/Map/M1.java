package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class M1 
{
	public static void main(String[] args)
	{	
		HashMap map1 = new HashMap();
		map1.put(12, "ABC");
		map1.put(14, "XYZ");
		map1.put(8, "LARA");
		map1.put(10, "Test");
		map1.put(2, "Hello");
		Set set=map1.keySet();
		Iterator it=set.iterator();
		Object key,value;
		while(it.hasNext())
		{
			key=it.next();
			value=map1.get(key);
			System.out.println(key+ ":" +value);
		}
	}
}
