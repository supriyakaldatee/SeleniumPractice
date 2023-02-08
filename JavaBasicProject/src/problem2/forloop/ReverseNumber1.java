package problem2.forloop;

public class ReverseNumber1 {

	public static void main(String[] args) {
		int num=123456789, rev=0, rem;
		System.out.println("original number is="+num);
		for(; num!=0; num/=10) {
			rem=num%10;
			rev=(rev*10)+rem;
		}
		System.out.println("Reversed Number is="+rev);

	}

}
