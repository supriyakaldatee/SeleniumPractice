package overridden.problem;
class animal1{
	void move() {
		System.out.println("animals can move");
	}
}
class dog extends animal1{
	void move() {
		System.out.println("dog can walk and run");
	}
	void bark() {
		System.out.println("dogs can bark");
	}
}

public class Overridden1 {

	public static void main(String[] args) {
		dog d=new dog();
		d.move();
		d.bark();
		animal1 a =new animal1();
		a.move();
		animal1 a1=new dog();
		a1.move();
		//a1.bark();  compile time error
	}

}
