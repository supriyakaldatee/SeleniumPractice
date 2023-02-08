package objectclass.program;
class Demo2{
	void show() {
		System.out.println("I am show mwthod");
	}
}
class Demo3 extends Demo2{
	int age;
	void show() {
		System.out.println(" i am 2nd show method");
	}
	@Override
	public int hashCode() {
		return age;
	}
}

public class ObjectClassEg2 {

	public static void main(String[] args) {
   Demo3 d=new Demo3();
   System.out.println(d);
   System.out.println(d.hashCode());
   d.show();
   Demo2 d1=new Demo2();
   System.out.println(d1);
   System.out.println(d1.hashCode());
	}

}
