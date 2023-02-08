package constant.variable;

public class FinalWithGlobalVariable {
	final int empId=101;
	double salary= 250000.90;
	void run() {
		System.out.println(empId+" "+salary);
	}

	public static void main(String[] args) {
		FinalWithGlobalVariable f=new FinalWithGlobalVariable();
	       f.run();
         f.salary=300000.78;    //we cannot reinitialize empId bcoz of final keyword
         f.run();
	}

}
