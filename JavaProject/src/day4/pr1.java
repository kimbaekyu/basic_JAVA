package day4;

public class pr1 {
	public static void main(String[] args) {
		TV myTV=new TV("LG",2017,32);
		myTV.show();
		
	}
}

class TV{
	String name;
	int year;
	int size;
	
	TV(String name,int year,int size){
		this.name=name;
		this.year=year;
		this.size=size;
	}
	void show() {
		System.out.println(name+"에서 만든 "+year+"년형 "+size+"인치 TV");
	}
}
