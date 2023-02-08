package drawpatteren.star;

public class InvertedHalfPyramidRotated {

	public static void main(String[] args) {
		int n=5;
		for(int i=n; i>=1; i--) {    // number of line
			for(int j=1; j<=n-i; j++) {   //spaces
				System.out.print(" "  );
			}
			for(int k=1; k<=i; k++) {   //patteren
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
