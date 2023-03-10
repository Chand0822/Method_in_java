package ImportantProgramOnString;
import java.util.Scanner;
public class StringIsPlaindrom {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=s.nextLine();
		
		char arr[]=str.toCharArray();
		char arr1[]=new char[arr.length];
		int j=arr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			arr1[j]=arr[i];
			j--;
		}
		System.out.println("Enter String are: "+str);
		String st=new String(arr1);
		System.out.println("Revers String are: "+st);
		 
		if(str.equals(st))
		{
			System.out.println("String are Palindrom");
		}
		else
		{
			System.out.println("String are not Palindrom");
		}
		
		s.close();

	}

}
