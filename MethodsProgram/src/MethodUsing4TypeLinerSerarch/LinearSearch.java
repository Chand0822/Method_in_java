package MethodUsing4TypeLinerSerarch;

import java.util.Scanner;

public class LinearSearch {
	
		void linearSearch()
		{
			//logic of linear search
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Array Length");
			int arr[]=new int[scan.nextInt()];
			System.out.println("Enter Array Elements");
			for(int i=0;i<=arr.length-1;i++)
			{
				arr[i]=scan.nextInt();
			}
			System.out.println("Enter the key");
			int key=scan.nextInt();
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]==key)
				{
					System.out.println("Key Found at the index "+i);
					return;
				}
			}
			System.out.println("Key Not Found");

			System.out.println("==========================================");
	   }
		
	
		
		void linearSearch2()
		{
			//logic of linear search
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Array Length");
			int arr[]=new int[scan.nextInt()];
			System.out.println("Enter Array Elements");
			for(int i=0;i<=arr.length-1;i++)
			{
				arr[i]=scan.nextInt();
			}
			System.out.println("Enter the key");
			int key=scan.nextInt();
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]==key)
				{
					System.out.println("Key Found at the index "+i);
					return;
				}
			}
			System.out.println("Key Not Found");

			System.out.println("==========================================");
	   }
		
		
}
