package inheritance.problem;
class vehicle{
	void wheels() {
		System.out.println(" I am vehicle");
	}
}
class car1 extends vehicle{
	void countwl() {
		System.out.println(" i have four wheel");
	}
	void color() {
		System.out.println(" my color is red");
	}
}
class scooty extends vehicle {
	void countwlc() {
		System.out.println("i have two wheels");
	}
}

public class Heiraraical1 {

	public static void main(String[] args) {
		scooty s=new scooty();
		s.countwlc();
		s.wheels();
		car1 c=new car1();
		c.countwl();
		c.color();
		c.wheels();
	}

}
