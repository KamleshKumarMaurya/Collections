package Map;

import java.util.HashMap;
import java.util.Set;

public class M8 
{
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("abc", 100);
		map.put("test", 600);
		map.put("lara", 300);
		map.put("xyz", 900);
		System.out.println(map);
		Set<String> keys=map.keySet();
		for(String key : keys)
		{
			System.out.println(key + ":" +map.get(key));
		}
	}

}
