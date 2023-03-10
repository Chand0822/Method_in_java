import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		CalculatorApp c=new CalculatorApp();
		
		c.add();
		System.out.println("Enter two value a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		c.sub(a, b);
		int res=c.mul();
		System.out.println("Multiplication of a and b"+res);
		
	    float res1=c.div(a,b);
		System.out.println("devison of a and b: "+res1);
		s.close();
	}

}
