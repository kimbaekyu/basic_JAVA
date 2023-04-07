package day6;
class Point{
	private int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
	public boolean equals(Object obj) {
		Point p=(Point)obj;
		if(x==p.x&&y==p.y)return true;
		else return false;
	}
}
public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println("======================");
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
		System.out.println(obj+"입니다.");
		System.out.println("======================");
	}
	public static void main(String[] args) {
		Point p=new Point(2,3);
		//print(p);
		Point t=new Point(2,3);
		System.out.println(p.equals(t));
	}
}
