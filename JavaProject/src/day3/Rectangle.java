package day3;
import java.util.*;
public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	public static void main(String[] args) {
		Rectangle a=new Rectangle();
		Scanner scanner=new Scanner(System.in);
		a.width=scanner.nextInt();
		a.height=scanner.nextInt();
		
		System.out.println("면적:"+a.getArea());
		scanner.close();
	}
}
