package multidimarray.program;

import java.util.Arrays;

public class M_Array1 {

	public static void main(String[] args) {
    int a[][]= {{2,3,4},{8,6,9},{6,8},{4,6,8,9}};
    for(int i=0; i<a.length; i++) {
    	for(int j=0; j<a[i].length; j++) {
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
    }
    System.out.println("****************************");
    int num[][]=a.clone();
    for(int i=0; i<a.length; i++) {
    	for(int j=0; j<a[i].length; j++) {
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
    }
    System.out.println("*******************");
    Arrays.sort(a);
    for(int i=0; i<a.length; i++) {
    	for(int j=0; j<a[i].length; j++) {
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
    }
    System.out.println(Arrays.equals(a, num));
	}

}
