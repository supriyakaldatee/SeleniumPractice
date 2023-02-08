package constant.variable;

public class FinalWithMethod {
	int cube(final int n) {
		return n*n*n;
		//n=n+2   we cannot reinitialize here
	}

	public static void main(String[] args) {
		FinalWithMethod f= new FinalWithMethod();
        System.out.println(f.cube(5));      // we initialize inside the instance/object block
	}

}
