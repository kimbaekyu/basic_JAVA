package day5;
class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setAge(int age) {
		this.age=age;
	}	
	public int getAge() {
		return age;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
	setAge(30);
	name="홍길동";
	height=175;
	setWeight(99);
	}
	void show() {
	System.out.println(age+name+height);
	}
	}

public class InheritanceEx {
	public static void main(String[] args) {
		Student s=new Student();
		s.set();
		s.show();
	}
}
