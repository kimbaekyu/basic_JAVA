package Java_DataStructure.day11.pr;

import java.util.Scanner;

import Java_DataStructure.day11.ArrayQueue;

public class pr1 {
	public static void main(String[] args) {
		ArrayQueue<String> q=new ArrayQueue<>();
		Scanner scanner=new Scanner(System.in);
		
		
		for(int i=0;i<9;i++) {
			String tmp=scanner.next();
			q.print();
			if(i>2) {
			if(tmp.equals("+")) {
				int a=Integer.parseInt(q.dequeue());
				int b=Integer.parseInt(q.dequeue());
				String result=(a+b)+"";
				q.enqueue(result);
			}
			if(tmp.equals("-")) {
				int a=Integer.parseInt(q.dequeue());
				int b=Integer.parseInt(q.dequeue());
				String result=(a-b)+"";
				q.enqueue(result);
			}
			if(tmp.equals("*")) {
				int a=Integer.parseInt(q.dequeue());
				int b=Integer.parseInt(q.dequeue());
				String result=(a*b)+"";
				q.enqueue(result);
			}
			if(tmp.equals("/")) {
				int a=Integer.parseInt(q.dequeue());
				int b=Integer.parseInt(q.dequeue());
				String result=(a/b)+"";
				q.enqueue(result);
			}
			else{
				
			}
			}
			System.out.println("result");
			q.print();
		}
		System.out.println(q.dequeue());
	}
}