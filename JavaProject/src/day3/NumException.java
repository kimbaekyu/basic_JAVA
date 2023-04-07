package day3;

public class NumException {
	public static void main(String[] args) {
		String[] stringNumber= {"23","12","3.14","998"};
		
		int i=0;
		try {
			for(i=0;i<stringNumber.length;i++) {
			int j=Integer.parseInt(stringNumber[i]);
			System.out.println("Change NUM: "+j);
			}
		}catch(NumberFormatException e) {
			System.out.println(stringNumber[i]+" "+"Not change");
		}
		
		
	}
}
