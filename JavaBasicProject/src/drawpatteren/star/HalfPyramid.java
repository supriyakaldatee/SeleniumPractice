package drawpatteren.star;

public class HalfPyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {   // number of line
			for(int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
