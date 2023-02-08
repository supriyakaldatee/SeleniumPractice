package overridden.problem;
class A{
	int age;
	A(){
		System.out.println(" i am constructor of class a");
	}
	void m() {
		System.out.println(" i am method of class a");
	}
	void n(int age) {
	 
		this.m();
		this.age=age;
		System.out.println("local age="+age);
		System.out.println("global age="+this.age);
		System.out.println("i am another method of class a");
	}
	A(int a){
		this();
		this.n(9);
		System.out.println("total call");
	}
}
class B extends A{
    char c;
	void s(char c){
		this.c=c;
		System.out.println("local char c value="+c);
		System.out.println("global char c value="+this.c);
		System.out.println("i am constructor of class b");
	}
	B(){
		super(6);
		this.s('t');
		System.out.println("i am another constructor of class b");
	}
}
class C extends B{
	void s(char c) {
		System.out.println("i am override method");
	}
	/*void display() {
	  this.s('h');
		System.out.println("i am display method");
	}*/
	
}
public class TotalRecall1 {

	public static void main(String[] args) {
		//A a=new A(2);
		//a.m();
		//a.n(5);
		//B b=new B();
		C c=new C();
		c.s('i');
	
	}

}
