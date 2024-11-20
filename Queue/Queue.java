public class Queue<T> {
	
	private java.util.Queue<T> q;
	
	public Queue()
	{
		this.q = new java.util.LinkedList<T>();
	}
	
	public T head()
	{
		return this.q.peek();
	}
	
	public void insert(T item)
	{
		this.q.add(item);
	}

	public T remove()
	{
		return this.q.remove();
	}
	
	public boolean isEmpty()
	{
		return this.q.isEmpty();
	}
	
	public String toString()
	{
		return this.q.toString();
	}
}
