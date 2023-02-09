package Feb9;
import java.util.Scanner;
public class Senario1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int arr[]= new int[5];               // creating an array of integer type with size 5 
		
		for(int i=0; i<=arr.length-1; i++) 
		{
			System.out.println("Enter student marks "+i);
			arr[i]=s.nextInt();               // taking input in array
		}
		System.out.println("Array containt are");
		System.out.print("arr--> ");
		for(int i=0; i<=arr.length-1; i++) 
		{
			
			System.out.print(arr[i]+" ");    //printing array data
		}
		
		System.out.println();
		s.close();
	}
}
