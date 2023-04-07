package day3;
import java.util.Scanner;
public class pr1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String alphabet= "abcdefghijklmnopqrstuvwxyz";
		String result = "";
		String result2 = "";
		
		//문자 입력받음
		System.out.printf("소문자알파벳 하나를 입력하세요: ");
		String str=scanner.next();
		char c=str.charAt(0);
		
		//입력한 문자까지 알파벳 출력
		for(int i=0;i<alphabet.length();i++) {
			result+=alphabet.charAt(i);
			if(c==alphabet.charAt(i))
				break;
		}
		
		result2=result;
		//출력된 알파벳에서 입력한문자부터 지우고 출력
		for(int i=result.length();i>0;i--) {
			
			String ch=alphabet.charAt(i)+"";
			result2=result2.replace(ch,"");
			System.out.println(result2);
			
		}
		
	}
}
