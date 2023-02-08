package polymorphism.program;
class Testing{
	private Testing() {
		System.out.println("i am testing constructor");
	}
	static Testing t=new Testing();
	public static Testing getInstanceOfTesting() {
		return t;
	}
	void call() {
		System.out.println("calling getOfInastance");
	}
}

public class SingltonEg1 {

	public static void main(String[] args) {
		Testing t=Testing.getInstanceOfTesting();
            t.call();
            Testing t1=Testing.getInstanceOfTesting();
            t1.call();
	}

}
