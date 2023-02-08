package polymorphism.program;
class Animal{
	void eat() {
		System.out.println("Animal eat");
	}
}
class elephant extends Animal{
	void eat() {
		System.out.println("elephant eat lay");
	}
}
class lion extends Animal{
	void eat() {
		System.out.println("Lion eat mutton");
	}
}
public class RunTimePOly1 {

	public static void main(String[] args) {
		Animal a=new lion();
		a.eat();
		Animal a1=new elephant();
		a1.eat();                      // here we need Inheritance, overriding, upcasting
	}

}
