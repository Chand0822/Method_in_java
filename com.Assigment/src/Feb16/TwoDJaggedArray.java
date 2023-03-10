package Feb16;
import java.util.Scanner;
public class TwoDJaggedArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1D length of the array to create 2D integer JAGGED array");
		int arr[][]=new int[s.nextInt()][];
		System.out.println("Enter 2D length of the array to create 2D integer JAGGED array");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("ENTER 2D length for 1D "+i);
			arr[i]=new int[s.nextInt()];
		}
		
		
		System.out.println("Enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter an element to store in array arr[ "+i+"][ "+j+"]");
			arr[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Array Contents Are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) {
			System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
		s.close();
	}
 
}
