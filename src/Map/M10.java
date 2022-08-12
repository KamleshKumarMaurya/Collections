package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class M10 
{
	public static void main(String[] args) 
	{
			HashMap<String,Integer> map = new HashMap<>();
			map.put("abc", 100);
			map.put("test", 600);
			map.put("lara", 300);
			map.put("xyz", 900);
			System.out.println(map);
			Set entries=map.entrySet();
			Map.Entry entry;
			for(Object obj : entries)
			{
				entry = (Map.Entry) obj;
				System.out.println(entry.getKey()+ ":" +entry.getValue());
			}
			
	}
	
	
	
}
