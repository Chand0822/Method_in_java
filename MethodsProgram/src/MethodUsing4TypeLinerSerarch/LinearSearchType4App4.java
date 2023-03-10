package MethodUsing4TypeLinerSerarch;

import java.util.Scanner;

public class LinearSearchType4App4 {

	public static void main(String[] args) {
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
		LinearSearchType4 search=new LinearSearchType4();		
		int res=search.linearSearch(arr,key);
		if(res>=0)
		{
			System.out.println("Key Found At The Index "+res);
		}
		else
		{
			System.out.println("Key Not Found");
		}

	}

}
