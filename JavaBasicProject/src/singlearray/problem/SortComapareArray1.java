package singlearray.problem;

import java.util.Arrays;

public class SortComapareArray1 {

	public static void main(String[] args) {
		int num[]= {3,7,8,5,2,1,9,};
		for(int a:num) {
			System.out.println(a);
		}
		System.out.println("******after sorting*********");
		Arrays.sort(num);
		for(int a:num) {
			System.out.println(a);
		}
       System.out.println("********copy of  array**********");
       int num1[]=Arrays.copyOf(num, num.length);
       for(int a:num1) {
    	   System.out.println(a);
       }
       System.out.println("********copyOfRange**********");
       int num2[]=Arrays.copyOfRange(num, 0, 4);
       for(int a:num2) {
    	   System.out.println(a);
       }
       System.out.println("num & num1 are equal="+Arrays.equals(num, num1));
       System.out.println("num & num1 are equal="+Arrays.equals(num, num2));
       System.out.println("num & num1 are equal="+Arrays.equals(num1, num2));
	}

}
