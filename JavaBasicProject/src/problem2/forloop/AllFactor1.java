package problem2.forloop;

public class AllFactor1 {

	public static void main(String[] args) {
		int n=12;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println("Positivr factor="+i);
			}
		}


	}

}
