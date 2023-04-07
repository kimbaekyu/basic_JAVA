package day8.pr;

import java.util.HashMap;
import java.util.Scanner;

public class pr2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		HashMap<String, Integer> dic=new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 입력하세요(예: korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구>>");
			String key=scanner.next();
			if(key.equals("그만"))
				break;
			else {
			Integer value=scanner.nextInt();
			dic.put(key, value);
			}
		}
		
		
		String str="";
		while(!str.equals("그만")) {
			System.out.print("인구 검색>> ");
			str=scanner.next();
			if(dic.containsKey(str))
				System.out.println(str+"의 인구는 "+dic.get(str));
			else if(str.equals("그만"))
				System.out.println("종료합니다.");
			else
				System.out.println(str+" 나라는 없습니다.");
		}
		scanner.close();
	}
}
