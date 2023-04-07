package day4;
import java.util.Scanner;
public class pr6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("인원수>>> ");
		int num=scanner.nextInt();
		Phone[] phone=new Phone[num];
		
		for(int i=0;i<phone.length;i++) {
			System.out.printf("이름과 전화번호 입력>>> ");
			String name=scanner.next();
			String number=scanner.next();
			phone[i]=new Phone(name,number);
		}
		
		System.out.println("저장되었습니다.");
		
		while(true) {
			System.out.printf("검색할 이름>>> ");
			String name=scanner.next();	
			
			if(name.equals("그만"))
				break;
			
			
			for(int i=0;i<phone.length;i++) {
				if(phone[i].name.equals(name))
					System.out.println(name+ "의 전화번호는"+phone[i].number);
				else
					System.out.println(name+" 이 없습니다.");
			}
			
			
		}
		scanner.close();
	}
}
class Phone{
	String name;
	String number;
	
	public Phone(String name,String number) {
		this.name=name;
		this.number=number;
	}
}
