package drawpatteren.star;

public class InvertedHalfPyramidRotated180 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {     // number of line
			for(int j=1; j<=n-i; j++) {   // sapaces
			
				System.out.print("  ");
			} 
			for(int k=1; k<=i; k++) {
			System.out.print("* ");
			}
			System.out.println();
		}

	}

}
