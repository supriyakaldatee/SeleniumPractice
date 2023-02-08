package statement.program;

public class TotalRecall2 {
	//Global variable with constructor
	int rollno;
	float fee;
	TotalRecall2(int rollno, float fee){
		System.out.println("local rollno="+rollno);
		System.out.println("local fee="+fee);
		System.out.println("initial global rollno="+this.rollno);
		System.out.println("initial global fee="+this.fee);
		//global var=local var
		this.rollno=rollno;
		this.fee=fee;
		System.out.println("after updated global rollno="+this.rollno);
		System.out.println("after updated global fee="+this.fee);
	}
	void display() {
		System.out.println(rollno+" "+fee);
	}

	public static void main(String[] args) {
		TotalRecall2 t=new TotalRecall2(111, 5000f);
          t.display();
          TotalRecall2 t1=new TotalRecall2(112, 6000f);
          t1.display();
	}

}
