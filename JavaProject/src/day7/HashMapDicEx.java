package day7;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> dic=new HashMap<String, String>();
		
		dic.put("baby","아가");
		dic.put("love","사랑");
		dic.put("apple","사과");
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는? ");
			String eng=scanner.next();
			if(eng.equals("exit")) {
				System.out.println("exit");
				break;
			}
			String kor=dic.get(eng);
			if(kor==null)
				System.out.println(eng+"없는 단어입니다.");
			else
				System.out.println(kor);
		}
		scanner.close();
	}
}
