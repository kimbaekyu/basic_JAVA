package Java_DataStructure.day11;

class Node<E>{
	public E item;
	public Node<E> next;
	public Node(E newItem) {
		item=newItem;
		next=null;
	}
	public Node(E newItem,Node<E> nextNode) {
		item=newItem;next=nextNode;
	}
}
public class LinkStack<E> implements StackInterface<E> {
	private Node<E>topNode;
	private final E ERROR=null;
	
	public LinkStack() {
		topNode=null;
	}
	public void push(E newItem) {
		topNode=new Node<>(newItem, topNode);
	}
	public E pop() {
		if(isEmpty())return ERROR;
		else {
			Node<E>temp=topNode;
			topNode=topNode.next;
			return temp.item;
		}
	}
	public E top() {
		if(isEmpty())return ERROR;
		else return topNode.item;
	}
	public boolean isEmpty() {
		return (topNode==null);
	}
	public E popAll() {
		topNode=null;
		return null;
	}
	public void print(){
		
	}
}
