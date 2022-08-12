//FIFO(first in first out)
package Queue;
public class M8 
{
	static class Node
	{
		int i;
		Node next;
	}
	static class Queue
	{
		Node first, last;
		void add(int data)
		{
			Node node = new Node();
			node.i = data;
			if(first == null)
			{
				first = last = node;
			}
			else
			{
				last.next = node;
				last = node;
			}
		}
		int readFirst()
		{
			if(first == null)
			{
				throw new ArithmeticException("no data in Queue");
			}
			return first.i;
		}
		int removeFirst()
		{
			if(first == null)
			{
				throw new ArithmeticException("no data in Queue");
			}
			int data = first.i;
			first = first.next;
			return data;
		}
	}
	public static void main(String[] args) 
	{
		Queue list = new Queue();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(4);
		list.add(50);
		System.out.println("read first :"+list.readFirst());
		System.out.println("remove first :"+list.removeFirst());
		System.out.println("read first :"+list.readFirst());
		
	}

}
