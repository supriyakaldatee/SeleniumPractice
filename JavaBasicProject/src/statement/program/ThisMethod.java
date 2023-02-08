package statement.program;

public class ThisMethod {
	void m(){
		System.out.println("hello m");
	}
    void n() {
    	System.out.println("hello n");
    	this.m();
    }
	public static void main(String[] args) {
		ThisMethod a=new ThisMethod();
        a.n();
	}

}
