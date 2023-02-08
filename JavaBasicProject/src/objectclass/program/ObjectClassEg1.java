package objectclass.program;
class Demo{
	void display() {
		System.out.println("I am disaplay");
	}
}

public class ObjectClassEg1 extends Demo{
	void print() {
		System.out.println("i am print");
	}

	public static void main(String[] args) {
		ObjectClassEg1 o=new ObjectClassEg1();
		System.out.println(o);
		System.out.println(o.hashCode());
	}

}
