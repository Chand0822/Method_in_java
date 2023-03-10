import java.util.Scanner;

public class CalculatorApp {

	
	void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two number a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Addition of two number is"+c);
	}
	
	void sub( int a,int b)
	{
		int c=a-b;
		System.out.println("Subtration of two number is"+c);
	}
	
	int mul()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two number a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a*b;
		return c;
	}
	
	
	float div(int a,int b)
	{
		
		int c=a/b;
		return c;
	}
	
		
	
}
