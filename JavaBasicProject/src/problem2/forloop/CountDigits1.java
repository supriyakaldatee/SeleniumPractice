package problem2.forloop;

public class CountDigits1 {

	public static void main(String[] args) {
		int num=123456789;
		int count=0;
		for(; num!=0; num/=10) {
			count++;
			}
		System.out.println(count);
		}

	}


