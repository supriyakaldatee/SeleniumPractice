package problem.basic;
   //Que= swap two numbers
public class MethodProblem5 {
	static void display(int s, int d) {
		int tempr=s+d;
		System.out.println("Before swapping number="+s+" "+d );
		s=tempr-s;
		d=tempr-d;
		System.out.println("Before swapping number="+s+" "+d );
	}

	public static void main(String[] args) {
		display(44, 55);
		System.out.println("******************");
		// swap two numbers without using 3rd variable
		int a=10;
		int b=20;
		System.out.println("Before swapping number="+a+" "+b );
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping number="+a+" "+b );
		System.out.println("******************");
		
		// swap two numbers  using 3rd variable
		int x=20;
		int y=30;
		System.out.println("Before swapping number="+x+" "+y );
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping number="+x+" "+y );
		System.out.println("******************");
		
		//  swap two numbers  using 3rd variable  but different method
		int num1=11;
		int num2=22;
		System.out.println("Before swapping number="+num1+" "+num2 );
		int tem=num1+num2;  //tem=33
		num1=tem-num1;  //33-11=22
		num2=tem-num2;  //33-22=11  //here we use tem-num1 result same 11
		System.out.println("After swapping number="+num1+" "+num2 );
		System.out.println("******************");
		
		
	}

}
