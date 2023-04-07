import java.util.Scanner;
public class arithmeticoperator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int time=input.nextInt();
		int second = time%60;
		int minute=(time/60) %60;
		int hour=(time/60) /60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초",time,hour,minute,second);
		input.close();
	}
}
