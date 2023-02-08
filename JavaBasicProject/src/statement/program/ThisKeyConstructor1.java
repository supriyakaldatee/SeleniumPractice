package statement.program;

public class ThisKeyConstructor1 {
     int x;
     ThisKeyConstructor1(int x){
    	this.x=x; 
    	System.out.println(this.x);
     }
	public static void main(String[] args) {
		ThisKeyConstructor1 t=new ThisKeyConstructor1(5);
		System.out.println(t.x);
		
	}

}
