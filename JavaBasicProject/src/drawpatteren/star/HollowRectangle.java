package drawpatteren.star;

public class HollowRectangle {

	public static void main(String[] args) {
		int n= 5;
		int m=6;
		for(int i=1; i<=n; i++) {   //number of line
			for(int j=1; j<=m; j++) {     //patteren
			
			if(i==1 || j==1 || i==n || j==m  ) {
				System.out.print( "*");
			}else {
			System.out.print( " ");
		} 
			}
     System.out.println();
	
		}
}
}