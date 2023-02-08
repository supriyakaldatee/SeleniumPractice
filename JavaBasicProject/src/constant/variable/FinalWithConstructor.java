package constant.variable;

public class FinalWithConstructor {
	// initialize with constructor
	final int speedlimit;
	FinalWithConstructor(){
		speedlimit=70;    //we initialize nonstatic variable inside the constructor
		System.out.println(speedlimit);
	}

	public static void main(String[] args) {
		FinalWithConstructor f=new FinalWithConstructor();
        System.out.println(f.speedlimit);     //here is no need to syso main method for access constructor but need to object creation
	}

}
