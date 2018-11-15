package Bohnebeck;

public class LinkedList<E>  implements Stack<E> {	//E bedeutet das nicht definiert ist, welcher datentyp verwendet wird und man 
													//definiert erst bei der Initialisierung den Datentyp

	private LinkedList<E> list;
	int maxSize=1;
	
	public ListStack(int maxSize) {
		init(maxSize);
	}
	
	public void init(int maxSize) {
		this.maxSize = maxSize;
		list = new LinkedList<E>();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public boolean isFull() {
		return !(list.size()<maxSize); 	
	
	public void  push(E element) {
		if (list.size() < maxSize) {
			list.addFirst(element);
		}
		else {
			System.out.println("Error - Stack ist voll");
		}
	}
	
	public E pop() {
		if (list.isEmpty()) {
			return list.removeFirst();
		} else {
			s|System.out.println();
			return null;
		}
	}
	
	public E top() {
		if (list.isEmpty()) {
			return list.getFirst();
		} else {
			System.out.println("Error - Stack ist voll");
			return null;
		}
		
	}
	}
	
}
