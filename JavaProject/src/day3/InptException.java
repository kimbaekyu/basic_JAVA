package day3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InptException {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=0;
		for(int i=0;i<3;i++) {
			try {
				n=scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("X re");
				scanner.next();//버퍼 비우기
				i--;
				continue;
			}
		}
		
	}
}
