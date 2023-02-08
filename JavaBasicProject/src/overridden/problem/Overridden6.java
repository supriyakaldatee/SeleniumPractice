package overridden.problem;
class Parent5{
	void show() {
		System.out.println("Parent show");
	}
}
class Child5 extends Parent5{
	void show() {
		super.show();
		System.out.println("Child show");
	}
}
class GrandChild extends Child5{
	void show() {
		super.show();
		System.out.println("GrandChild show");
	}
}

public class Overridden6 {

	public static void main(String[] args) {
     Parent5 p=new GrandChild();
     p.show();
	}

}
