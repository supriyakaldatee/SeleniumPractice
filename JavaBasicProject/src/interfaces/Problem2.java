package interfaces;
interface Bank{
	float rateOfInterest();
}
interface Rbi{
	int year();
}
class SBI implements Bank, Rbi{
	public float rateOfInterest() {
		return 8.7f;
	}
	public int year() {
		return 5;
	}
}
class HDFC implements Bank{
	public float rateOfInterest() {
		return 9.7f;
	}
}

public class Problem2 {

	public static void main(String[] args) {
   SBI s= new SBI();                               // multiple inheritance
   System.out.println(s.rateOfInterest());
   System.out.println(s.year());
   HDFC h=new HDFC();             //mulilevel inheritance
   System.out.println(h.rateOfInterest());
	}

}
