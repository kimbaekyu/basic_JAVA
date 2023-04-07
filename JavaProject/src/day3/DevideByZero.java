package day3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DevideByZero {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int dividend;
		int divisor;
		
		
		while(true) {
			
			try{	
				System.out.print("나뉨수: ");
				dividend=scanner.nextInt();
				System.out.print("나눗수: ");
				divisor=scanner.nextInt();
				try {
					System.out.println("result: "+dividend/divisor);
					break;
				}catch(ArithmeticException e) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
			}catch(InputMismatchException eh) {
				System.out.println("숫자를 입력해주세요.");
				break;
			}
			
			
		}
		scanner.close();
	
}
}
