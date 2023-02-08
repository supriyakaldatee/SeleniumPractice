package inheritance.problem;
class Parent {
	void print() {
		System.out.println(" this is parent class");
	}
}
class son extends Parent {
	void printThis() {
		System.out.println("this is child class");
	}
}

public class SingleInheritance1 {

	public static void main(String[] args) {
		son c=new son ();
		c.print();
        c.printThis();
	}

}
