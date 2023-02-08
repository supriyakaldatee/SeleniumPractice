package overridden.problem;
class Parent4{
	static void m1() {
		System.out.println("From parent= static method");
	}
	void m2() {
		System.out.println("From parent = non static method");
	}
}
class Child4 extends Parent4{
	static void m1() {
		System.out.println("From child = static method");
	}
	void m2() {
		System.out.println("From child =non static method");
	}
}

public class Overridden5 {

	public static void main(String[] args) {
       Parent4 obj=new Child4();
       obj.m1();
       obj.m2();
	}

}
