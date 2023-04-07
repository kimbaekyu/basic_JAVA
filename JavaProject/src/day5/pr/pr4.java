package day5.pr;

public class pr4 extends Point{
	public pr4(){}
	public pr4(int x,int y) {
		super(x,y);
		if(x<0)
			super.move(0, 0);
	}
	//class pr4->class PositivePoint
	protected void move(int x, int y) {
		if(x<0||y<0)
			super.move(getX(),getY()) ;
		else
			super.move(getX()+x,getY()+y);
	}
	public String toString() {
		return "("+getX()+","+getY()+")"+"의 점";
	}
	public static void main(String[] args) {
     	   pr4 p = new pr4();
		   p.move(10, 10);
		   System.out.println(p.toString()+"입니다.");
		   p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
		   System.out.println(p.toString()+"입니다.");
		   
		   pr4 p2 = new pr4(-10, -10);
		   System.out.println(p2.toString()+"입니다.");
	}

}
