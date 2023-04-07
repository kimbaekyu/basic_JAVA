package day8.pr;
import java.util.Scanner;
import java.util.Vector;
public class pr1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Vector<Integer> v=new Vector<Integer>();
		int n;int max=0;
		System.out.print("정수(-1이 입력될 때까지)>>");
		while(true) {
			
			n=scanner.nextInt();
			if(n==-1)
				break;
			v.add(n);
			
		}
		for(int i=0;i<v.size();i++) {
			if(max<=v.get(i))
				max=v.get(i);
		}
		System.out.println("Max: "+max);
		scanner.close();
	}
}
