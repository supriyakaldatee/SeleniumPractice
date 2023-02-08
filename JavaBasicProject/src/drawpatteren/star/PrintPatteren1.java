package drawpatteren.star;

public class PrintPatteren1 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1; i<=n; i++) {    //number of line
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=n; k++) {
				System.out.print(" *   ");
			}
			System.out.println();
		} 

	}

}
