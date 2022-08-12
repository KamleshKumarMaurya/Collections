package Queue;

import java.util.PriorityQueue;

public class M3 
{
	public static void main(String[] args) {
		
		PriorityQueue<String> queue=new PriorityQueue<>();
		queue.add("abc");
		queue.add("xyz");
		queue.add("test");
		queue.add("lara");
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
//remove and poll both are use for read and remove head elements
