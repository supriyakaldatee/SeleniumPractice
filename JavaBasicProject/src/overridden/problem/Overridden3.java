package overridden.problem;
class Animal2{
	public void move() {
		System.out.println("Animal can move");
	}
	void display() {
		System.out.println("I am displaying animal class");
	}
}
class Dog2 extends Animal2{
	public void move() {
		System.out.println("Dog can walk and run");
		//display();
	}
	public void calling() {
		move();
		super.move();
		display();
		System.out.println("I am calling..");
	}
}

public class Overridden3 {

	public static void main(String[] args) {
     Dog2 d=new Dog2();
     d.calling();
	}

}
