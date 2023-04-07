package day3;
import java.util.Scanner;
public class pr2 {
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 몇 개? ");
		n=scanner.nextInt();
		int[] arr=new int[n];
		int k;int init;int t;
		//랜덤 값 대입
		for(int i=0;i<arr.length;i++) {
			k = (int) (Math.random()*100 + 1); // 1에서 100까지 정수를 랜덤하게 생성
			arr[i]=k;
		}
		//값 출력
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("===========================");
		
		//최초 값 저장
		init=arr[0];
		
		//중복 값 수정
		for(int i=1;i<arr.length;i++) {
			//System.out.printf("i:%d\n j:",i);
			
			for(int j=0;j<i;j++) {
				//System.out.printf("%d ",j);
				
			}
			
		}
		//최종 출력
				System.out.println("최종출력\n===========================");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
	}
}


