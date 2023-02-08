package problem3.whileloop;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int num=12;
		int count=0;
		 int i=0;
			while(i<=num) {
				i++;
			if(num%i==0)
			count++;
		}
		if(count==2) {
			System.out.println("Given number is prime");
		}else {
			System.out.println("Given number is not prime");
		}
	}
}

	

