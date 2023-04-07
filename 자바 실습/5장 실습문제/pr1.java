package day5.pr;
class TV{
	   private int size;
	   public TV(int size) { this.size = size; }
	   protected int getSize() { return size; } 
	   void printProperty(){
			System.out.println(size+"인치 TV");
	   }
	}

class ColorTV extends TV{
	int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
	}
	@Override
	void printProperty(){
		System.out.println(getSize()+"인치 "+color+" Color TV");
    }
}

class IPTV extends ColorTV{
	String addr;
	public IPTV(String addr,int size, int color) {
		super(size,color);
		this.addr=addr;
	}
	@Override
	void printProperty(){
		System.out.println(addr+"주소의 "+getSize()+"인치 "+color+" 컬러 IPTV");
		
    }

}

public class pr1 {
	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
		   
		   IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 						//"192.1.1.2" 주소에 32인치, 2048컬러
		   iptv.printProperty();

		}
}
