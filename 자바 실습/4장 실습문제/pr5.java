package day4;
import java.util.Scanner;
public class pr5 {
	//class pr5->class MonthSchedule
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int d;
		
		System.out.println("이번달 스케줄 관리 프로그램");
		Day[] day=new Day[30];
		for(int i=1;i<=day.length;i++) {
			day[i]=new Day();
		}
		out:
		while(true) {
			System.out.print("할일(입력:1 보기:2 끝내기:3)>> ");
			int num=scanner.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("날짜(1~30)? ");
				d=scanner.nextInt();
				System.out.print("할일(빈칸없이입력)? ");
				String work=scanner.next();
				day[d].set(work);
				break;
			case 2:
				System.out.print("날짜(1~30)? ");
				d=scanner.nextInt();
				System.out.printf("%d일의 할 일은 ",d);
				day[d].show();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break out;
			}
		}
		scanner.close();
	}
}
class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + " 입니다.");
	}
}


