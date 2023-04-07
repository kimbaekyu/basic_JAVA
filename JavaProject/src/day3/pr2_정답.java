package day3;
import java.util.Scanner;
public class pr2_정답 {
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Input Num: ");
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      
	      for(int i=0;i<arr.length;i++) {
	    	  arr[i]=(int)(Math.random()*100+1);
	    	  for(int j=0;j<i;j++) {
	    		  if(arr[i]==arr[j]) {
	    			  i--;
	    			  break;
	    		  }
	    	  }
	      }
	    //최종 출력
			System.out.println("최종출력\n===========================");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
	   }

}



