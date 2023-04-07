package day4;
import java.util.Scanner;
public class BookArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String title;
		String author;
		Book[] book=new Book[2];
		
		for(int i=0;i<book.length;i++) {
			System.out.printf("Title>>");
			title=scanner.nextLine();
			System.out.printf("Author>>");
			author=scanner.nextLine();
			
			book[i]=new Book(title,author);
		}
		for(int i=0;i<book.length;i++) {
			System.out.printf("(%s,%s)",book[i].title,book[i].author);

		}
		scanner.close();
	}
}
