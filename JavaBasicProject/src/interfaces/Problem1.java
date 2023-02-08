package interfaces;
interface Printable{
	int salary=45000;
	void draw();
}
class Circle implements Printable{
	 public void  draw() {    // we cannot reduce visibility
		System.out.println("i m circle draw");
	}
}

public class Problem1 {

	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.println(Printable.salary);  
		c.draw();
	}

}
