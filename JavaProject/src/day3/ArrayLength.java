package day3;
import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] array=new int[5];
		int sum=0;
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		
		System.out.println("평균: "+(double)sum/array.length);
		scanner.close();
	}
}
