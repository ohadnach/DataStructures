
public class Stack<T> {
	
	private java.util.Stack<T> s;
	
	public Stack()
	{
		this.s = new java.util.Stack<T>();
	}
	
	public T top()
	{
		return this.s.peek();
	}
	
	public void push(T item)
	{
		this.s.push(item);
	}

	public T pop()
	{
		return this.s.pop();
	}
	
	public boolean isEmpty()
	{
		return this.s.empty();
	}
	
	public String toString()
	{
		return this.s.toString();
	}
}
