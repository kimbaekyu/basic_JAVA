import java.util.Scanner;
public class pr_while {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=0,count=0;
		int n=0;double sum=0;
		n=0;
		
		while(num!=-1) {
			System.out.printf("Input Num: ");
			num=scanner.nextInt();
			sum+=num;count++;
			
		}
		System.out.printf("갯수: %d 평균: %f\n",count,sum/count);
	}
}
