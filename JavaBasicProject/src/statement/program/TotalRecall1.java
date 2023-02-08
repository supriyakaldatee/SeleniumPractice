package statement.program;

public class TotalRecall1 {
	// Non-static global variable or instance global variable
	int variable=51;
	void method(int variable) {
		System.out.println("value of local variable="+variable);
		variable=10;
		System.out.println("value of local variable="+variable);
		System.out.println("value of instance variable="+this.variable);
		this.variable=variable;
		System.out.println("value of local variable="+variable);
		System.out.println("value of instance variable="+this.variable);
	}
	void method() {
		int variable=40;
		System.out.println("value of local variable="+variable);
		System.out.println("value of instance variable="+this.variable);
		this.variable=variable;
		System.out.println("value of local variable="+variable);
		System.out.println("value of instance variable="+this.variable);
	}

	public static void main(String[] args) {
		TotalRecall1 t= new TotalRecall1();
		t.method(20);
        t.method();
	}

}
