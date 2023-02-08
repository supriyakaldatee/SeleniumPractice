package overridden.problem;
class ABC{
	void myMethod() {
		System.out.println("Method of ABC class");
	}
}


public class Overridden4 extends ABC {
	void myMethod() {
		super.myMethod();
		System.out.println("overriding method of Overridding4 class");
	}

	public static void main(String[] args) {
		Overridden4 o=new Overridden4(); 
			o.myMethod();	
	}

}
