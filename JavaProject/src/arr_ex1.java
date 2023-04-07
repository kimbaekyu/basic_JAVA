import java.util.Scanner;
public class arr_ex1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] arr=new int[5];
		int max=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Max: "+max);
		scanner.close();
	}
}
