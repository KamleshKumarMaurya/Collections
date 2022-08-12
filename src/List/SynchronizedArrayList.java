package List;

import java.util.ArrayList;

public class SynchronizedArrayList extends ArrayList
{
	private ArrayList list;
	
	SynchronizedArrayList(ArrayList list)
	{
		this.list=list;
	}
	public boolean add(Object obj)
	{
		boolean flag;
		synchronized(this)
			{
				flag=list.add(obj);
				try
				{
					Thread.sleep(10000);
				}
				catch(InterruptedException ex)
				{
				}
			}
		return flag;
	}
	public Object get(int index)
	{
		Object obj=null;
		synchronized(this)
		{
			obj=list.get(index);
		}
		return obj;
	}
}
