package polymorphism.program;
class Bank{
	float rateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	float rateOfInterest() {
		return 6.7f;
	}
}
class HDFC extends Bank{
	float rateOfInterest() {
		return 7.0f;
	}
}

public class RunTimePoly2 {

	public static void main(String[] args) {
		Bank b=new HDFC();
		System.out.println(b.rateOfInterest());
		 b=new SBI();
		System.out.println(b.rateOfInterest());

	}

}
