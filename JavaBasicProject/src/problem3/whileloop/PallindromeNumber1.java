package problem3.whileloop;

public class PallindromeNumber1 {

	public static void main(String[] args) {
		int num=454, rev=0, rem;
		int temp=num;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		if(num==rev) {
			System.out.println("Given number is pollindrome");
		}else {
			System.out.println("Given number is not pollindrome");
		}

	}

}
