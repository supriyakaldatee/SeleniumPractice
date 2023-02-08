package statement.program;
class Student101{
	int rollno;
	float fee;
	Student101(int rollno){
		this.rollno=rollno;
	}
	Student101(int rollno, float fee){
		this(rollno);
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+fee);
	}
}

public class ThisState2 {

	public static void main(String[] args) {
		Student101 t=new Student101(111);
		//System.out.println(t.rollno+" "+t.fee);
		t.display();
	}

}
