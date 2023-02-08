package statement.program;

public class TotalRecall3 {
	int a;
	int b;
	TotalRecall3(int a, int b){
		this.a=a;
		this.b=b;		
	}
	void display() {
		System.out.println("a="+a+" " +"b="+b);
	}
	public static void main(String[] args) {
		TotalRecall3 t=new TotalRecall3(11, 22);
           t.display();
        TotalRecall3 t1=new TotalRecall3(12, 32);
        t1.display();
	}

}
