package problem3.whileloop;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int res=0;
		while(temp>0) {
			int ld=temp%10;
			res=res+ld*ld*ld;
			temp=temp/10;
		}
         if(res == num) {
        	 System.out.println("Given number is armstrong");
         }else {
        	 System.out.println("Given number is not armstrong");
         }
	}

}
