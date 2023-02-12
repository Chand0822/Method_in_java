package Feb10;

import java.util.Scanner;

public class Senario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter height of the Players :");
		Scanner s=new Scanner(System.in);
		float arr[]=new float[8];        //  creating float array of size 8
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(" Height of the Players :" +i);
			arr[i]=s.nextFloat();     // taking input from user as string
			
		}
		System.out.println("The containt of array :");
		System.out.print("Players  height in arry-->");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");  // just printing data of array
		}
		
		s.close();

	}

}
