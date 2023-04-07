package day5.pr;
import java.util.Scanner;
abstract class Converter {
	   abstract protected double convert(double src); 
	   abstract protected String getSrcString(); 
	   abstract protected String getDestString(); 
	   protected double ratio; // 비율
	   public void run() {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println(getSrcString()+"을 "+getDestString()
	          +"로 바꿉니다.");
	      System.out.print(getSrcString()+"을 입력하세요>> ");
	      double val = scanner.nextDouble();
	      double res = convert(val);
	      System.out.println("변환 결과: "+res
	          +getDestString()+"입니다");
	      scanner.close();
	   }
	}
class Won2Dollar extends Converter{
	
	public Won2Dollar(int ratio) {
		super.ratio=ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	} 
	protected String getSrcString() {
		return "원";
	}
	protected String getDestString() {
		return "달러";
	}; 
}
class Km2Mile extends Converter{
	public Km2Mile(double ratio) {
		super.ratio=ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	} 
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "mile";
	}; 
}
public class pr2 {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); 
	   // 1달러는 1200원
	   toDollar.run();
//	   Km2Mile toMile = new Km2Mile(1.6); 
//       // 1마일은 1.6km
//	   toMile.run();


	}
}
