package drawpatteren.star;

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=n; i>=1; i--) {   //number of lines
			for(int j=1; j<=i; j++) {  //patteren
				System.out.print(" * ");
				}
			System.out.println();
			}
		}

	}


