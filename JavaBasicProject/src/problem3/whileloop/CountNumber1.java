package problem3.whileloop;

public class CountNumber1 {

	public static void main(String[] args) {
		int num=345678;
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		System.out.println(count);
   }
}