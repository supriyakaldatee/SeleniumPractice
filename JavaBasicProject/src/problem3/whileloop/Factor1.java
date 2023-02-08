package problem3.whileloop;

public class Factor1 {

	public static void main(String[] args) {
		int num=14;
		
		int i=0;
		while(i<=num) {
			
			i++;
			if(num%i==0) {
				
				System.out.println(i);
			}
		}
	}

}
