import java.util.Scanner;
public class ex_break {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
		String text=scanner.nextLine();
		if(text.equals("exit"))
			break;
		}
		System.out.println("break");
	}
}
