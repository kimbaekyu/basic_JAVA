package Java_DataStructure.day11;
interface StackInterface<E>{
	public void push(E newItem);
	public E pop();
	public E top();
	public boolean isFull();
	public boolean isEmpty();
	public void popAll();
}
public class ArrayStack<E> implements StackInterface<E> {
	private E[] stack;
	private int topIndex;
	private static final int DEFAULT_CAPACITY=64;
	private final E ERROR=null;
	
	public ArrayStack() {
		stack=(E[])new Object[DEFAULT_CAPACITY];
		topIndex=-1;
	}
	public ArrayStack(int n) {
		stack=(E[])new Object[n];
		topIndex=-1;
	}
	
	public void push(E newItem) {}
	public E pop() {}
	public E top() {}
	public boolean isFull() {}
	public boolean isEmpty() {}
	public void popAll() {}
}
