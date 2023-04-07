package day4;

public class CircleArray {
	int radius;
	public CircleArray(int radius) {
		this.radius=radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		CircleArray[] c=new CircleArray[5];
		for(int i=0;i<c.length;i++) {
			c[i]=new CircleArray(i);
		}
		for(int i=0;i<c.length;i++) {
			System.out.printf("Circle %d 면적:[%.4f]\n",i,c[i].getArea());;
		}
	}
}

