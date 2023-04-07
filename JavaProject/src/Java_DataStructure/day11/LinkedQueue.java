package Java_DataStructure.day11;

public class LinkedQueue<E> implements QueueInterface<E> {
	private Node<E> tail;
	public LinkedQueue() {
		tail=null;
	}
	public void enqueue(E newItem) {
		Node<E> newNode=new Node<>(newItem);
		if(isEmpty()) {
			newNode.next=newNode;
			tail=newNode;
		}
		else {
			newNode.next=tail.next;
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public E dequeue() {
		if(isEmpty()) {return null;}
		else {
			E tmp=tail.next.item;
			if(tail.next==tail) {
				tail=null;
			}
			else {
				tail.next=tail.next.next;
			}
			return tmp;
		}
	}
	
	public E front() {
		if(isEmpty()) {return null;}
		else return tail.next.item;
	}

	public boolean isEmpty() {
		return (tail==null);
	}
	public void dequeueAll() {
		tail=null;
	}
	void print() {
		while(true) {
			
		}
	}
}
