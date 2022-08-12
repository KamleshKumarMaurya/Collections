//LIFO (last in first out)
package Queue;
public class M7
{
	static class Node
	{
		int i;
		Node next;
	}
	static class Stack
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
		int readLast()
		{
			return last.i;
		}
		int removeLast()
		{
			Node current = first;
			while(current.next != last)
			{
				current = current.next;
			}
			int data = last.i;
			current.next = null;
			last = current;
			return data;
		}
	}
	public static void main(String[] args) 
	{
		Stack list = new Stack();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(4);
		list.add(50);
		System.out.println("read last: "+list.readLast());
		System.out.println("remove last: "+list.removeLast());
		System.out.println("read last: "+list.readLast());
	}

}
