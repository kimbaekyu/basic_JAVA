import java.util.Scanner;
public class ex_dowhile1 {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	char c='a';
	char ch='z';
	do {
		System.out.printf("%c ",c++);
	}while(c<='z');
	System.out.println();
	
	scanner.close();}
}
