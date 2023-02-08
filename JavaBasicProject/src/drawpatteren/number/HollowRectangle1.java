package drawpatteren.number;

public class HollowRectangle1 {

	public static void main(String[] args) {
		int n=5;
		int m=6;
		//int number=0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(i==1 || j==1 || i==n || j==m) {
					System.out.print(j);
					//number++;
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
