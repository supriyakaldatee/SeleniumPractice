package singlearray.problem;

public class SingleArray1 {

	public static void main(String[] args) {
		int a[]= {22,44,55,66,77};
		System.out.println(a.length);  //find length
		System.out.println(a[2]);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);     //using for loop to print
		}
		for(int i:a) {
			System.out.println(i);         //using for each loop to print
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]==55) {
				System.out.println(a[i]);
				break;
			}else {
				System.out.println("a is not 55");
		}
	}
}
}


