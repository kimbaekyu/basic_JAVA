package day4;

public class Book {
	String title;
	String author;
	
	Book(String title){
		this(title,"작자미상");
		System.out.println("this 생성자 호출됨");
	}
	Book(String title,String author){
		this.title=title;
		this.author=author;
	}
	
	public static void main (String[] args) {
		Book a=new Book("어린왕자","생택쥐페리");
		
		
		System.out.println(a.title+" "+a.author);
		Book b=new Book("춘향전");//초기화하면서 호출 찍힘
		System.out.println(b.title+" "+b.author);
	}
}
