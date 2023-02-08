package problem3.whileloop;

public class ReverseNumber1 {

	public static void main(String[] args) {
		int num=6789, rev=0, rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
       System.out.println("Reverse Number is="+rev);
	}

}
