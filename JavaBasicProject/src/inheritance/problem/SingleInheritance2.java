package inheritance.problem;
class fruit {
	fruit () {
		System.out.println(" this is fruit class ");       // constructor 
	}
	void taste() {
		System.out.println("fruit are sweet");            // method
	}
}
class apple extends fruit {
	apple() {
		System.out.println("apple class cons.....");        //constructor
	}
	void shape() {
		System.out.println("apple are round");                 //method
	}
}

public class SingleInheritance2 {

	public static void main(String[] args) {
		apple a=new apple();
		a.shape();
		a.taste();

	}

}
