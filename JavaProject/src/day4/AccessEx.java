package day4;
class Sample{
	public int a;
	private int b;
	int c;
}
public class AccessEx {
	public static void main(String[] args) {
		Sample aclass=new Sample();
		aclass.a=10;
		//aclass.b=10;
		aclass.c=10;
	}
}
