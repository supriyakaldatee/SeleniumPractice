package drawpatteren.star;

public class RhombusPatteren {

	public static void main(String[] args) {
		int n=5;
		// upper half
		for(int i=1; i<=n; i++) {   // number of line
			for(int j=1; j<=n-i; j++) {    //spaces
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {   //patteren
				System.out.print("*");
			}
			System.out.println();
			// lower half
			for ( i=n; i>=1; i--) {   //number of line
				for(int j=1; j<=n-i; j++) {    //spaces
					System.out.print(" ");
				}
				for(int k=1; k<=2*i-1; k++) {  //lower patteren
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}
