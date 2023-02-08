package polymorphism.program;

public class CompileTimePOly1 {
	static void sum(int a) {
		System.out.println("int value="+a);
	}
	static void sum() {
		System.out.println("zero param");
	}
	static void sum(double d) {
		System.out.println("double d="+d);
	}

	public static void main(String[] args) {
         sum();
         sum(5);
         sum(5.6);

	}

}
