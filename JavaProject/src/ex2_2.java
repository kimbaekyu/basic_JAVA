import java.util.Scanner;
public class ex2_2 {
	public static void main(String[] ars) {
		Scanner scanner=new Scanner(System.in);
		int xl1,yl1,xr1,yr1,xl2,yl2,xr2,yr2;
		int s=0;
		xl1=scanner.nextInt();yl1=scanner.nextInt();
		xr1=scanner.nextInt();yr1=scanner.nextInt();
		
		xl2=scanner.nextInt();yl2=scanner.nextInt();
		xr2=scanner.nextInt();yr2=scanner.nextInt();
		//겹치는 경우
		//r1<r2
		if(xl1<xr1&&xr1<xr2&&yl1<yr1&&yr1<yr2)
			s=(xr1-xl2)*(yr1-yl2);
		//r1>r2
		if(xl1<xr2&&xr2<xr1&&yl2<yl1&&yl1<yr2)
			s=(xr2-xl1)*(yr2-yl1);
		//포함되는 경우
		//r1<r2
		if(xl2<xl1&&xl1<xr2&&yl2<yr1&&yr1<yr2)
			s=(xr1-xl1)*(yr1-yl1);
		//r1>r2
		if(xl2>xl1&&yr1>yr2)
			s=(xr2-xl2)*(yr2-yl2);
		
		//겹치지 않는 경우
		//r1<r2
		if(xl1<xl2&&yr1<yr2)	
			s=0;
		
		System.out.println(s);
		
	}
}
