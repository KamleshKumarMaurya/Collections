package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class M11
{
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(90);
		list.add(910);
		list.add(19);
		list.add(10);
		Iterator it=list.iterator();
		Consumer<Integer> c1=new Consumer<Integer>()
				{
					@Override
					public void accept(Integer t) 
					{
						System.out.println(t);
					}
				};
				it.forEachRemaining(c1);
				System.out.println(list);
		}

}
