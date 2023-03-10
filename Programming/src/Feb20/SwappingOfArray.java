package Feb20;
import java.util.Scanner;
public class SwappingOfArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int arr[]=new int[s.nextInt()];
		System.out.println("Enter the element of an array as integer");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the element of an array as integer ["+i+"]");
			arr[i]=s.nextInt();
			
		}
		System.out.println("Array containt are----> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		System.out.println("Enter 2 position for Swapping of an array between 0 to "+(arr.length-1));
		int a=s.nextInt();
		int b=s.nextInt();
		int help=arr[a];
		arr[a]=arr[b];
		arr[b]=help;
		
		System.out.println("Swapping of array are------>");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		s.close();	
	}

}
