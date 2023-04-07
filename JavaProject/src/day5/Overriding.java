package day5;
class Weapon{
	protected int fire() {
		return 1;
	}
}
class Cannon extends Weapon{
	@Override
	protected int fire() {
		return 10;
	}
}
public class Overriding {
	public static void main(String[] args) {
	Weapon weapon;
	weapon=new Weapon();
	System.out.println("Normal Weapon: "+weapon.fire());
	weapon=new Cannon();
	System.out.println("Cannon Weapon: "+weapon.fire());
	}
}
