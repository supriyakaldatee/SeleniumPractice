package statement.program;
  // when same variable name eg-age then we access static global variable with class name
public class ThisStaticLocal {
	static int age=39;

	public static void main(String[] args) {
		int age= 40;
      System.out.println("I am local age="+age);       //we access local variable with direct
      System.out.println("I am global age="+ThisStaticLocal.age);   //we access static global variable with class name
      
	}

}
