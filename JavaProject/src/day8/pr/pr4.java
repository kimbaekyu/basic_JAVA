package day8.pr;

import java.util.Vector;

interface IStack<T> {
	T pop();
	boolean push(T ob);
}
class MyStack<T, E> implements IStack<T>{
	Vector<E> v;
	int head=0;
	public MyStack() {
		v=new Vector<E>();
	}
	
	public T pop() {
		if(head==0)
			return null;
		else {
		head--;
		return (T) v.remove(head);
		}
	}
	public boolean push(T ob) {
		if(head==10)
			return false;
		v.add((E) ob);
		head++;
		return true;
	}
}
public class pr4{
	//class pr4->class StackManager
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i=0; i<10; i++) stack.push(i);
		while(true) {
			Integer  n = stack.pop();
			if(n == null) break;
			System.out.print(n+" ");
		}
	}
}
