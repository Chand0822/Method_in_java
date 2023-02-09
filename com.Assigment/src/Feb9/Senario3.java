package Feb9;

import java.util.Scanner;

public class Senario3 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in); 
	int arr[]= new int[5];         // creating an array of integer type with size 5 
	
	int i=0;
	do
	{
		System.out.println("Enter student marks "+i);
		arr[i]=s.nextInt();           // taking input in array
		i++;
	}
	while(i<=arr.length-1);
	System.out.println("Array containt are");
	System.out.print("arr--> ");
	i=0;
	do
	{
		
		System.out.print(arr[i]+" ");     
		i++;
	}
	while(i<=arr.length-1);
	System.out.println();
	s.close();
}
}
