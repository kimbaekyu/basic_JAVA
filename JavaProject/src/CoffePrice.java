import java.util.Scanner;
public class CoffePrice {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String coffee=scanner.next();
		int price=0;
		
		switch(coffee){
			case "e":				
			case "cf":
			case "cl":
				price=3500;
				break;
			case "a":
				price=2000;
				break;
		}
		System.out.println(coffee+" "+price);	
		scanner.close();
	}
}
