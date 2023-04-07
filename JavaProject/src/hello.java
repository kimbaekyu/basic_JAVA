import java.util.Scanner;
public class hello {
	public static int sum(int n,int m) {
		return n+m;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i=input.nextInt(); int j=input.nextInt();
		int s;
		char a;
		
		String string="JDK";
		s=sum(i,j);
		a='?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(string);
		string+="1.8";
		System.out.println(string);
		
		
	}
}
