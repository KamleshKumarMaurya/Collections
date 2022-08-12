package Map;

import java.util.HashMap;
import java.util.Set;

public class M9 
{
public static void main(String[] args) 
{
		HashMap map = new HashMap();
		map.put("abc", 100);
		map.put("test", 600);
		map.put("lara", 300);
		map.put("xyz", 900);
		System.out.println(map);
		Set<String> enteries=map.keySet();
		for(String e1:enteries)
		{
			System.out.println(e1+ ":" +map.get(e1));
		}
}
}
//HashMap doesn't maintain order
