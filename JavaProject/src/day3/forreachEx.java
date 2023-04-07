package day3;
	
public class forreachEx {
	enum Week{월,화,수,목,금,토,일};
	public static void main(String[] args) {
		int[] n= {1,2,3,4,5};
		String[] fruit= {"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
		for(int i:n) {
			sum+=i;
			System.out.printf("%d ", i);
		}
		System.out.println("sum:"+sum);
		for(String s:fruit) {
			System.out.printf("%s ", s);
		}
		System.out.println();
		for(Week day:Week.values()) {
			System.out.print(day+"요일 ");
		}	
	}
}
