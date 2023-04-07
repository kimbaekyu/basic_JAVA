package day3;

public class Circle {
	int radius;
	String name;
	
	public Circle() {}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza=new Circle();
		pizza.name="자바 피자";
		pizza.radius=10;
		
		System.out.println(pizza.name+"면적: "+pizza.getArea());
	
		Circle donut=new Circle();
		donut.name="도넛 피자";
		donut.radius=2;
		
		System.out.println(donut.name+"면적: "+donut.getArea());
	}
}
