package Bohnebeck;

public interface Stack<E> {

	public void init(int max);
	public boolean isEmpty();
	public boolean isFull();
	public void  push(E element);
	public E pop();
	public E top();
}
