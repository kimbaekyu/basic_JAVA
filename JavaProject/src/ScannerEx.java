import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.printf("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.\n");
		String name=input.next();
		String city=input.next();
		int age=input.nextInt();
		Double weight=input.nextDouble();
		boolean single=input.nextBoolean();
		
		System.out.printf("이름은 %s, 도시는 %s 나이는 %d 체중은 %.2f 독신여부는 %b\n",name,city,age,weight,single);
		
	}
}
