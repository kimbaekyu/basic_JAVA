package Java_DataStructure;
 interface GenericListInterface<E>{
	public void add(int i,E x);
	public void append(E x);
	public E remove(int i);
	public boolean removeItem(E x);
	public E get(int i);
	public void set(int i,E x);
	public int indexOf(E x);
	public int size();
	public boolean isEmpty();
	public void clear();
}
public class GenericArrayList<E> implements GenericListInterface<E>{
	private E[] item;
	private int numItems;
	private static final int DEFAULT_CAPACITY=64;
	
	public GenericArrayList() {
		item=(E[])new Object[DEFAULT_CAPACITY];
		numItems=0;
	}
	public GenericArrayList(int n) {
		item =(E[])new Object E[n];
		numItems=0;
	}
	public void add(int k,E x) {
		if(numItems>=item.length||k<0||k>numItems) {
			System.out.println("add() error");
		}
		else {
			for(int i=numItems-1;i>=k;i--) {
				item[i+1]=item[i];
			}
			item[k]=x;
			numItems++;
		}
		print();
	}
	public void append(E x) {
		if(numItems>=item.length)
			System.out.println("append() error");
		else {
			item[numItems++]=x;
		}
		print();
	}
	
	
	public E remove(int k) {
		System.out.println("==제거전==");
		if(isEmpty()||k<0||k>numItems-1) {
			System.out.println("remove() error");
			return null;
			}
		else {
			E tmp=item[k];
			for(int i=k;i<=numItems-2;i++) {
				item[i]=item[i+1];
			}
			numItems--;
			System.out.println("==제거후==");
			print();
			return tmp;
		}
		
	}
	public boolean removeItem(E x) {
		int k=0;
		while(k<numItems&&item[k]!=x) {
			k++;
		}
		if(k==numItems) { 
			return false;
		}
		else {
			for(int i=k;i<=numItems-2;i++) {
				item[i]=item[i+1];
			}
			numItems--;
			print();
			return true;
		}
	}
	public E get(int i) {
		if(i>0&&i<numItems-1) {
			print();
			return item[i];
		}
			
		else {
			print();
			return null;
		}
			
	}
	public void set(int i,E x) {
		if(i>=0&&i<numItems-1)
			item[i]=x;
		else
			System.out.println("set() error");
		print();
	}
	public int indexOf(E x){
		int i=0;
		while(i<numItems&&item[i]!=x) {
			i++;
		}
		print();
		if(i==numItems) return -1;
		else return i;
	}
	public int size(){
		return numItems;
	}
	public boolean isEmpty(){
		print();
		return numItems==0;
	}
	public void clear(){
		System.out.println("item.length: "+item.length);
		item=(E[])new Object[item.length];
		numItems=0;
		print();
	}
	public void print() {
		System.out.println("<ArrayList>");
		for(int i=0;i<numItems;i++)
			System.out.print(item[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		GenericArrayList<Integer> list=new GenericArrayList<>();
		list.add(0, 300);
		list.add(0, 100);
		list.append(500);
		list.remove(2);
		System.out.println("====");
		list.append(700);
		list.remove(1);
//		list.append(1);list.append(2);list.append(3);list.append(4);list.append(5);
		
	}
}
