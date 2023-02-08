package statement.program;

public class ThisNonStaticLocal1 {
	int rollno;
	float fee;
	ThisNonStaticLocal1(int rollno, float fee){
		System.out.println("Local variable="+rollno);
		System.out.println("Local variable fee="+fee);
		System.out.println("global variable="+this.rollno);
		System.out.println("global variable fee="+this.fee);
		//Global var= local var
		this.rollno=rollno;
		this.fee=fee;
		System.out.println("Local variable="+rollno);
		System.out.println("Local variable fee="+fee);
		System.out.println("global variable="+this.rollno);
		System.out.println("global variable fee="+this.fee);
	}
        void display() {
        	System.out.println(rollno+" "+fee);     //optional write
        }

	public static void main(String[] args) {
		ThisNonStaticLocal1 t=new ThisNonStaticLocal1(111, 5000f);
		t.display();
		ThisNonStaticLocal1 t1=new ThisNonStaticLocal1(112, 6000f);
		t1.display();
	}
  
}
