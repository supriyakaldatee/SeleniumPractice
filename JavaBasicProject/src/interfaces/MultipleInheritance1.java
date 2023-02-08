package interfaces;
interface Show{
	void showable();
}
interface Print{
	void printable();
}

public class MultipleInheritance1 implements Show, Print {
	public void showable() {
		System.out.println("this is the method of showable");
	}
	public void printable() {
		System.out.println("This is the method of printable");
	}
	void display() {
		System.out.println("i am method of class MultipleInheritance1");
	}
	

	public static void main(String[] args) {
		MultipleInheritance1 m=new MultipleInheritance1();
          m.display();
         // m.showable();  we can write also like this
        // m.printable();
          Print p=new MultipleInheritance1();
       p.printable();
       Show s=new MultipleInheritance1();
         s.showable();
         
	}

}
