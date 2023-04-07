import java.util.Scanner;
public class ex_continue {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int num;int sum=0;
		for(int i=0;i<5;i++) {
			System.out.printf("Input num: ");
			num=scanner.nextInt();
		if(num<0)
			continue;
		else
			sum+=num;
		}
		System.out.println("Sum: "+sum);
	}
}
