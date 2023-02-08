package singlearray.problem;

public class SingleArraySum1 {

	public static void main(String[] args) {
		double sal[]= {22.3,66.8,55.7};
         double sum=0;
         for(int i=0; i<sal.length; i++) {
        	 sum=sum+sal[i];
         }
         System.out.println(sum);
        /* for(double d:sal) {
        	 sum=sum+d;
         }
         System.out.println(sum);*/
	}

}
