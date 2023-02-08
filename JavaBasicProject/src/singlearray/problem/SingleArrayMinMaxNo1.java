package singlearray.problem;
class Test1{
     static void min(int arr[]) {
		int min=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
			System.out.println("min value="+min);
		
     }
		static void max (int arr[]) {
			int max=arr[0];
			for(int i=1; i<arr.length;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			System.out.println("max value="+max);
		}
	}
	public class SingleArrayMinMaxNo1 {
	public static void main(String[] args) {
		int arr[]={2,3,4,5,1};
		Test1.min(arr);
		Test1.max(arr);
	}

}
