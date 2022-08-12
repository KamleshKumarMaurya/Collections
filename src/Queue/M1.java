package Queue;

import java.util.PriorityQueue;

public class M1 
{
	public static void main(String[] args) {
		
		PriorityQueue queue=new PriorityQueue();
		queue.add(19);
		queue.add(18);
		queue.add(90);
		queue.add(13);
		queue.add(89);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
//Java Queue interface orders the element in FIFO(First In First Out) manner. 
//In FIFO, first element is removed first and last element is removed at last.