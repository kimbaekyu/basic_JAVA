package Java_DataStructure.day11;
interface QueueInterface<E>{
	public void enqueue(E newItem);
	public E dequeue();
	public E front();
	public boolean isEmpty();
	public void dequeueAll();
}
public class ArrayQueue<E> implements QueueInterface<E> {
	private E queue[];
	private int front, tail, numItems;
	private static final int DEFAULT_CAPACITY=64;
	
	public ArrayQueue() {
		queue=(E[])new Object[DEFAULT_CAPACITY];
		front=0;
		tail=queue.length-1;
		numItems=0;
	}
	
	public ArrayQueue(int n) {
		queue=(E[])new Object[n];
		front=0;
		tail=n-1;
		numItems=0;
	}
	
	private boolean isFull() {
		return (numItems==queue.length);
	}
	
	public void enqueue(E newItem) {
		if(isFull())System.out.println("enqueue error");
		else {
			tail=(tail+1)%queue.length;
			queue[tail]=newItem;
			numItems++;
		}
	}
	
	public E dequeue(){
		if(isEmpty())return null;
		else {
			E queueFront=queue[front];
			front=(front+1)%queue.length;
			numItems--;
			return queueFront;
		}
	}
	public E front(){
		if(isEmpty())return null;
		else return queue[front];
	}
	public boolean isEmpty(){
		return (numItems==0);
	}
	
	public void dequeueAll(){
		queue=(E[])new Object[queue.length];
		front=0;
		tail=queue.length-1;
		numItems=0;
	}
	
	public void print() {
		//출력
		for(int i=(front)%queue.length;i<=tail;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayQueue<String> q=new ArrayQueue<>();
		q.enqueue("test1");q.enqueue("test2");q.enqueue("test3");q.enqueue("test4");
		q.print();
		q.dequeue();
		q.print();
		q.dequeue();
		q.print();
	}
}
