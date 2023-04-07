package day4;

public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius=1; name="";
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public Circle(int r,String n) {
		radius=r;
		name=n;
	}
	public static void main(String[] args) {
		Circle a=new Circle();
		Circle b=new Circle(10,"javaPizza");
		
		double area=b.getArea();
		System.out.println(b.name+"면적은: "+area);
		
		double areaa=a.getArea();
		a.name="donut Pizza";
		System.out.println(a.name+"면적은: "+areaa);
	}
}
