package Mar9;

import java.util.Scanner;

public class BubbleSort {

	void bubbleSort1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array length");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter Array Contents");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Array Elements Before Sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int temp;
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array Elements After Sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	void bubbleSort2(int arr[])
	{
		System.out.println("Array Elements Before Sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int temp;
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array Elements After Sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	int[] bubbleSort3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array length");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter Array Contents");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Array Elements Before Sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int temp;
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	int[] bubbleSort4(int arr[])
	{
		System.out.println("Array Elements Before Sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int temp;
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		return arr;
	}


}
