package problem1.ifelse;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=23;
		int b=45;
		int c=67;
		if(a>b && a>c) {
			System.out.println("a is greater");
		}else if(b>a && b>c) {
			System.out.println("b is greater");
		}else if(c>a && c>b) {
			System.out.println("c is greater");
		}else {
			System.out.println("condition fail");
		}
	}
}

