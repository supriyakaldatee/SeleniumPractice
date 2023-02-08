package statement.program;
class A1{
	A1(){
		this(20.4);
		System.out.println("hello zero");
	}
	A1(double d){
		this(20);
		System.out.println("hello double="+d);
	}
	A1(int x){
		System.out.println("hello int="+x);
	}
}

public class ThisStatement1 {

	public static void main(String[] args) {
		A1 a1=new A1();
        A1 a2= new A1(20);
        A1 a3= new A1(20.4);
	}

}
