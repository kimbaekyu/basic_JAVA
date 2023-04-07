package day5.pr;
import java.util.Scanner;
interface Stack {
	   int length(); // 현재 스택에 저장된 개수 리턴
	   int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	   String pop(); // 스택의 톱(top)에 문자열 리턴
	   boolean push(String val); // 스택의 톱(top)에 문자열 저장 
	}

public class pr5 implements Stack{
	//class pr5->class StringStack
	public String[] arr;
	private int head;
	private int tail;
	public pr5(int n) {
		arr=new String[n];
		head=n-1;
		tail=0;
	}
	@Override
	public int length() {
		// 현재 스택에 저장된 개수 리턴
		return tail;
	}

	@Override
	public int capacity() {
		// 스택의 전체 저장 가능한 개수 리턴
		return (head+1)-tail;
	}

	@Override
	public String pop() {
		// 스택의 톱(top)에 문자열 리턴
		if(tail>0)
			tail--;
		String tmp=arr[tail];
		arr[tail]="";
			return tmp;
		
	}

	@Override
	public boolean push(String val) {
		// 스택의 톱(top)에 문자열 저장
		if(tail<=head) {
			arr[tail]=val;
			//System.out.println("arr[tail]: "+arr[tail]+" tail: "+tail+" head: "+head);
			tail++;
			return true;
		}

		else 		
			return false;
			
	}

		
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력");
		int n=scanner.nextInt();
		pr5 stack=new pr5(n);
		
		while(true) {
			System.out.println("저장된 개수: "+stack.length()+" "+"저장 가능한 개수: "+stack.capacity());
			System.out.print("문자열 입력>> ");
			String val=scanner.next();
			
			if(val.equals("그만")) {
				for(int i=0;i<=stack.head;i++) {
					if(stack.tail>0) {
						System.out.print("Array["+(stack.tail-1)+"]: "+" ");
						System.out.println(stack.pop()+" ");
					}
				}
				
				break;
			}	
			else if(!stack.push(val)){
				System.out.println("스택이 꽉 차서 푸시 불가!\r\n");				
			}
		}
		scanner.close();
	}
	
}
