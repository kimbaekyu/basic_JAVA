package day4;
import java.util.Scanner;
public class pr2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = scanner.nextInt();
		int sci = scanner.nextInt();
		int eng = scanner.nextInt();
		Grade me = new Grade(math, sci, eng);
		System.out.println("평균은 " + me.average() + " 입니다.");

		scanner.close();
	}
}

class Grade{
	int math;
	int sci;
	int eng;
	
	Grade(int math,int sci,int eng){
		this.math=math;
		this.sci=sci;
		this.eng=eng;
	}
	
	int average() {
		return (this.math+this.sci+this.eng)/3;
	}
}
