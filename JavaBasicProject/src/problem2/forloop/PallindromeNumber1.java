package problem2.forloop;

public class PallindromeNumber1 {

	public static void main(String[] args) {
		int no=121;
		int temp=no;
		int rev=0,rem;
		for(; temp!=0; temp/=10) {
			rem=temp%10;
			rev=rev*10+rem;
		}
     if(no==rev) {
    	 System.out.println(no+" "+"is pallindrome number");
     }else {
    	 System.out.println(no+" "+"is not pallindrome number");
     }
	}

}
