package Feb13;

import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[4][3];
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
		
		System.out.println("Enter the class: "+i+" and marks: "+j+" of student");
		arr[i][j]=s.nextInt();
		
		
		    }
		}
		
		System.out.println("Array containt are :");
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
		
		System.out.print(arr[i][j]+ " ");
		
		    }
			System.out.println();
		}
		
	
		s.close();
	}

}
