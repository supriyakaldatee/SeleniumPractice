package drawpatteren.star;

public class PallindromicPatteren {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {   //number of line
			for(int j=1; j<=n-i; j++) {   //sapaces
				System.out.print(" ");  // double space new patteren draw
		  }
			for(int k=1; k<=i; k++) {
				System.out.print("*");  //1st half patteren
			}
			for(int k=2; k<=i; k++) {  //2nd half patteren
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
