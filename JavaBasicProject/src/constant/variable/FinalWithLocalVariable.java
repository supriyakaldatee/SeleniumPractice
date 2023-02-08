package constant.variable;

public class FinalWithLocalVariable {

	public static void main(String[] args) {
		final int age=30;
		//age=40;    // we cannot reinitialize age value bcoz of final keyword
     System.out.println(age);
	}

}
