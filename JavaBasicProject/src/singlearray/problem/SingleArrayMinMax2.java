package singlearray.problem;

public class SingleArrayMinMax2 {

	public static void main(String[] args) {
		int a[]= {7,8,4,3,8,1};
		int min=a[0];
		for(int i=1; i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("min value="+min);
		
	int max=a[0];
	for(int i=1; i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}
	System.out.println("max value="+max);
   
}
}