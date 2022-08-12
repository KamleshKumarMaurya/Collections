package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;

public class M11 
{
	public static void main(String[] args) 
	{
			HashMap map = new HashMap();
			map.put("abc", 100);
			map.put("test", 600);
			map.put("lara", 300);
			map.put("xyz", 900);
			System.out.println(map);
			System.out.println("After sorting based on value -----------");
			Set set=map.entrySet();
			Comparator c1=new Comparator()
					{
						public int compare(Object o1, Object o2)
						{
							Map.Entry e1=(Map.Entry) o1;
							Map.Entry e2=(Map.Entry) o2;
							Integer v1=(Integer) e1.getValue();
							Integer v2=(Integer) e2.getValue();
							return v1.compareTo(v2);
						}
					};
				TreeSet set1=new TreeSet(c1);
				set1.addAll(set);
				System.out.println(set1);
	}
}
