package day4;
import java.util.Scanner;
public class pr4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Rectangle r=new Rectangle(2,2,8,7);
		Rectangle s=new Rectangle(5,5,6,6);
		Rectangle t=new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함");
		if(t.contains(s)) System.out.println("t는 s을 포함");
		scanner.close();
	}
}
class Rectangle{
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x,int y,int width,int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	int square() {
		return width*height;
	}
	
	void show() {
		System.out.printf("좌표(%d,%d)에서 크기 %dX%d 인 사각형\n",x,y,width,height);
	}
	
	Boolean contains(Rectangle r) {
		if(x<r.x&&(r.x+r.width)<(x+width)&&y<r.y&&(r.y+r.height)<(y+height))
			return true;
		else 
			return false;
	}
}