package inheritance.problem;
class fruit1{
	int fruitAge;
	fruit1(){                                      //constructor
		System.out.println("fruit class cons..");
		fruitAge=7;
	}
	void color() {
		System.out.println("color depends on fruit");
	}
}
class orange extends fruit1{
	int fruitAge;
	orange(){   // java will write default super() statement
		System.out.println("orange class cons...");
		fruitAge=4;
	}
	void color() {
		System.out.println("orange color is orange");
	}
	void shape() {          //all class access here
		System.out.println("orange is round");
		System.out.println("orange fruitAge="+fruitAge);  // not directly called bcoz of this is variable not method
		System.out.println("fruit1 fruitAge="+super.fruitAge);   //super. call the parent class
		color();                                         // direct call without type syso bcoz of method
		super.color();
	}
}


public class SingleInheritance4 {

	public static void main(String[] args) {
		orange o=new orange();       
		o.shape();

	}

}
