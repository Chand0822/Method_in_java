package Feb10;

import java.util.Scanner;

public class Senario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Char :");
		Scanner s=new Scanner(System.in);
		char arr[]=new char[5];   // String type of array of size 8  
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(" Charater :" +i);
			arr[i]=s.next().charAt(0);                         // taking input in array as char    
			
		}
		System.out.println("The containt of array :");
		System.out.print("Char in arry-->");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");  // just printing the out put of the data of array
		}
		
		s.close();

	}
	
}
