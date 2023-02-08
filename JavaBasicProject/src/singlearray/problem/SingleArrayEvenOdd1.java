package singlearray.problem;

public class SingleArrayEvenOdd1 {

	public static void main(String[] args) {
     int a[]= {2,3,4,5,6,7,8};
     for(int i=0; i<a.length; i++) {
    	 if(a[i]%2==0) {
    		 System.out.println("even number="+a[i]);
    	 }else {
    		 System.out.println("odd number="+a[i]);
    	 }
     }
	}

}
