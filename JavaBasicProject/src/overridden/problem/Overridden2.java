package overridden.problem;
class Human{
	void eat() {
		System.out.println("human is eating");
	}
	void display() {
		System.out.println("i am only display");
	}
}
 class Boy extends Human{
	 public void eat() {
		 super.eat();
		 display();
		 System.out.println("Boy is eating");
	 }
 }

public class Overridden2 {

	public static void main(String[] args) {
     Boy b=new Boy();
     b.eat();
	}

}
