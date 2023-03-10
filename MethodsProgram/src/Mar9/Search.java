package Mar9;

import java.util.Scanner;

public class Search 
{
	
	void binarySearch1()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array lenth");
		int arr[]=new int[s.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter Array element at index"+i);
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter a key for Searching ");
		int key=s.nextInt();
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("key found at index : "+mid);
				return;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
				high=high;
			}
			else
			{
				high=mid-1;
				low=low;
			}
		}
		
		System.out.println("Key not found");
		
	}
	
	
	
	
	

	void binarySearch2(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("key found at index : "+mid);
				return;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
				high=high;
			}
			else
			{
				high=mid-1;
				low=low;
			}
		}
		
		System.out.println("Key not found");
	}
	
	
	

	int binarySearch3()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array lenth");
		int arr[]=new int[s.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter Array element at index"+i);
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter a key for Searching ");
		int key=s.nextInt();
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				
				return mid;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
				high=high;
			}
			else
			{
				high=mid-1;
				low=low;
			}
		}
		return -1;
		
	}

	
	
	
	
	int binarySearch4(int arr1[],int key1)
	{
		int low=0;
		int high=arr1.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key1==arr1[mid])
			{
				
				return mid;
			}
			else if(key1>arr1[mid])
			{
				low=mid+1;
				high=high;
			}
			else
			{
				high=mid-1;
				low=low;
			}
		}
		return -1;
		
	}
}
