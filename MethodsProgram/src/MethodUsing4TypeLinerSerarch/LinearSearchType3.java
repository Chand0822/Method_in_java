package MethodUsing4TypeLinerSerarch;

import java.util.Scanner;

public class LinearSearchType3 
{
	int linearSearch()
	{		//logic of linear search
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter Key to Search");
		int key=scan.nextInt();		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	
}
