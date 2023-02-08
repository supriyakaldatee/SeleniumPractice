package inheritance.problem;
class vegi {
	vegi ( double d) {
		System.out.println(d);      //constructor
	}
	void taste() {
		System.out.println("fruit are sweet");
	}
}
class tomato extends vegi {
	tomato() {
		super(2.5);
		System.out.println("tomato class cons.....");    //constructor
	}
	void shape() {
		System.out.println("tomato are round");
	}
}

public class SingleInheritance3 {

	public static void main(String[] args) {
		tomato t=new tomato();
         t.taste();
         t.shape();
	}

}
