package day7;

public class StringEx {
	public static void main(String[] args) {
		String a=new String(" C#");
		String b=new String(",C++");
		System.out.println("String a의 길이"+ a.length());
		System.out.println("a.contains: "+ a.contains("#"));
		a=a.concat(b);
		System.out.println("concat: "+a);
		a=a.trim();
		System.out.println("trim: "+a);
		a=a.replace("C#", "Java");
		System.out.println("replace: "+a);
		String s[]=a.split(",");
		for(String str:s)
			System.out.println("split: "+str);
		a=a.substring(5);System.out.println("substring: "+a);
		char c=a.charAt(2);System.out.println("charAt: "+c);
		
	}
}
