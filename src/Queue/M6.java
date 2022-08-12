package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class M6 
{
	public static void main(String[] args)
	{
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("Ravi");    
		deque.add("Vijay");     
		deque.add("Ajay");   
		System.out.println(deque);
		System.out.println("----------");
		for(String s1:deque)
		{
			System.out.println(s1);
		}
		System.out.println("--------------");
		deque.pollLast();//read and remove last element
		System.out.println(deque);
		System.out.println("-------------");
		deque.poll();//read and remove first element
		System.out.println(deque);
	}
}
//Java Deque Interface is a linear collection that supports element insertion and removal at both ends.
//Deque is an acronym for "double ended queue".