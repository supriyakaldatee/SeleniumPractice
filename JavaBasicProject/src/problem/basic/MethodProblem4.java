package problem.basic;
   //compute Quotient and Remainder
public class MethodProblem4 {
	void displayQuotientAndRemainder(double a, double b) {
		double Q= a/b;
		double rem=a%b;
		System.out.println("value of Quotient="+Q);
		System.out.println("value of Remainder="+rem);
	}

	public static void main(String[] args) {
		MethodProblem4 m=new MethodProblem4();
		m.displayQuotientAndRemainder(65.2,23.9);
	}

}
