package problem2.forloop;
    //Natural Number
    //Which has only two factor 1and itself
    //19= 1 and 19= Prime Number
    //28= 2,4,7,11,13,17 = Not Prime Number
public class PrimeNumber1 {

	public static void main(String[] args) {
		int num=19; 
		int count=0;
      if(num>1) { 
    	  for(int i=1; i<=num; i++) {
    		  if(num%i==0)
    			  count++;
    	  }
    	  if(count==2) {
    		  System.out.println("Prime number");
    	  }else {
        	  System.out.println("Not Prime NUmbers");
          }
 
      }
	}

}
