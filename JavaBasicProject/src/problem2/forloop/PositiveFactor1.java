package problem2.forloop;

public class PositiveFactor1 {
      
	public static void main(String[] args) {
		int num=6;
		int i;
		for(i=0; i<=num; i++) {
			if(num%i==0) {
				System.out.println("All number of factor="+i);
			}
		  
		if(i%2!=0) {
			System.out.println("Negtive factor number is="+i);
		}

	}
	}
}
