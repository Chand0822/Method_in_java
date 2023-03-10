package Mar9;

import java.util.Scanner;

public class SearchApp {

	public static void main(String[] args) {
		
		Search s=new Search();
		s.binarySearch1();
		
		System.out.println("=======================");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Array lenth");
		int arr[]=new int[s1.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter Array element at index"+i);
			arr[i]=s1.nextInt();
		}
		
		System.out.println("Enter a key for Searching ");
		int key=s1.nextInt();
		s.binarySearch2(arr, key);
		
		System.out.println("=======================");
		int res=s.binarySearch3();
		if(res>=0)
		{
			System.out.println("key found at index : "+res);
		}
		else
		{
			System.out.println("key not found : ");
		}
		
		
		
		System.out.println("=======================");
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter Array lenth");
		int arr1[]=new int[s3.nextInt()];
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.println("Enter Array element at index"+i);
			arr1[i]=s3.nextInt();
		}
		
		System.out.println("Enter a key for Searching ");
		int key1=s3.nextInt();
		int res1=s.binarySearch4(arr1, key1);
		if(res1>=0)
		{
			System.out.println("key found at index : "+res1);
		}
		else
		{
			System.out.println("key not found : ");
		}
	}

}
