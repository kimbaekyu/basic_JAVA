package Java_DataStructure.day11;

import Java_DataStructure.day10.LinkedList;
import Java_DataStructure.day10.ListInterface;

public class ListStack<E> implements StackInterface<E> {
	private ListInterface<E> list;
	
	public ListStack() {
		list=new LinkedList<E>();
	}
}
