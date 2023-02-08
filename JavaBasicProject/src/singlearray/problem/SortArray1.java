package singlearray.problem;

import java.util.Arrays;

public class SortArray1 {

	public static void main(String[] args) {
		int num[]= {4,2,6,7,8,3,1};
         /*for(int i=0; i<num.length; i++) {
        	 System.out.println(num[i]);
         }
         Array.sort(num);
         System.out.println("after sorting");
         for(int i=0;i<num.length;i++) {
        	System.out.println(num[i]); 
         }*/
	  for(int a:num) {
		  System.out.println(a);
	  }
	  Arrays.sort(num);
	  System.out.println("after sorting");
	  for(int a:num) {
		  System.out.println(a);
	  }
	  System.out.println("*******copy of array***********");
	  int copyArray[]=Arrays.copyOf(num,10);
	  for(int num1:copyArray) {
		 System.out.println(num1);
	  }
	  System.out.println("*****copy Range array******");
	  int[]num2=Arrays.copyOfRange(num, 3, 10);
	  for(int a:num2) {
		  System.out.println(a);
	  }
	}

}
