package inheritance.problem;
class grandpa{
	void myHome(){
		System.out.println("This is grandpa home");
	}
}
class father1 extends grandpa{
	void myCar(){
		System.out.println("this is father car");
	}
}
class child1 extends father1{
	
	void myBike(){
	System.out.println("this is child bike");
}
}
public class MultilevelInheritance1 {

	public static void main(String[] args) {
		child1 c= new child1();
		c.myHome();
		c.myCar();
		c.myBike();
	}

}
