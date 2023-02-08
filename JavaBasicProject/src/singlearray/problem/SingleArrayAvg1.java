package singlearray.problem;

public class SingleArrayAvg1 {

	public static void main(String[] args) {
		int age[]= {55,87,34,45,67,89};
		int sum=0;
		double avg;
		for(int i=0; i<age.length; i++) {
			 sum=sum+age[i];
			
		}
		/*for(int a:age) {
			sum=sum+a;
		}*/
		int arrayLength=age.length;
		avg=sum/arrayLength;
		System.out.println(sum);
		System.out.println(avg);
	}

}
