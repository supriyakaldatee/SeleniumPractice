package statement.program;

public class ImpThisProgram {
	int age;
	void call() {
		System.out.println(" I am call Method");
	}
    void m(int age) {
    	System.out.println("Local age="+age);
    	System.out.println("global age="+this.age);
    	this.call();
    	System.out.println("this impThisProgram vaule is="+this);
    }
	public static void main(String[] args) {
		ImpThisProgram i=new ImpThisProgram();
		System.out.println("i value="+i);
		i.m(25);

	}

}
