package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class M2
{
	public static void main(String[] args) {
		
		PriorityQueue queue=new PriorityQueue();
		queue.add(19);
		queue.add(18);
		queue.add(90);
		queue.add(13);
		queue.add(89);
		Iterator it=queue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-----------");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue);
	}
}
//peek() and  element() method both are only for reading first element not remove