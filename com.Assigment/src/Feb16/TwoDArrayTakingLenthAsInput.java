package Feb16;

import java.util.Scanner;

public class TwoDArrayTakingLenthAsInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of 1D and 2D  array as integer");
		int arr[][]=new int[s.nextInt()][s.nextInt()];
		System.out.println("Enter  containt  of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("Enter an element to store in array index "+i+ j);
			arr[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Array containt are -->");
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
