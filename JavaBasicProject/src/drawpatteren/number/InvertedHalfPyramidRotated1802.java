package drawpatteren.number;

public class InvertedHalfPyramidRotated1802 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k);    //triangle same condition but here is small difference of print (k+"")
			}
			System.out.println();
		}
		
	}

}
