import java.util.Scanner;
public class ex2_1 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.printf("Input Price: ");
		int price=scanner.nextInt();
		int result=price;
		
		System.out.printf("50000: %d, ",result/50000);
		result%=50000;
		System.out.printf("10000: %d, ",result/10000);
		result%=10000;
		System.out.printf("1000: %d, ",result/1000);
		result%=1000;
		System.out.printf("100: %d, ",result/100);
		result%=100;
		System.out.printf("50: %d, ",result/50);
		result%=50;
		System.out.printf("10: %d, ",result/10);
		result%=10;
		System.out.printf("1: %d",result/1);
		
		
		
		
		
		
	}
}
