package day3;

public class IrregularArray {
	public static void main(String[] args) {
		int[][] array=new int[4][];
		
		array[0]=new int[3];
		array[1]=new int[2];
		array[2]=new int[3];
		array[3]=new int[2];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=(i+1)*10+j;
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
