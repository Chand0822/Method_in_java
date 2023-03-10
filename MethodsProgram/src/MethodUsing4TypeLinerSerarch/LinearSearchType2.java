package MethodUsing4TypeLinerSerarch;

import java.util.Scanner;

public class LinearSearchType2 
{

	/*
	
	
	void linearSearch(int a, int b)
	{
		//logic of linear search
		Scanner scan=new Scanner(System.in);
		System.out.println("Array Length is : "+a);
		int arr[]=new int[a];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Key is : "+b);
		int key=b;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Key Found at the index "+i);
				return;
			}
		}
		System.out.println("Key Not Found");

		scan.close();
		
			
}

*/
	
	void linearSearch(int arr[],int key)
	{
		//logic of linear search
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Key Found at the index "+i);
				return;
			}
		}
		System.out.println("Key Not Found");

	}
}