package drawpatteren.star;

public class Traingle {

	public static void main(String[] args) {
		for(int i=0; i<7; i++) {  // number of lines
			for(int j=0; j<=7-i; j++) {  
				System.out.print(" ");
				
			}
			for(int k=0; k<=i;k++) {
				System.out.print("*"+" ");  
			}
			System.out.println();
		}

	}

}
