package Mar9;

import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) {
		BubbleSort sort=new BubbleSort();
		sort.bubbleSort1();
		System.out.println("==========================================");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array length");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter Array Contents");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		sort.bubbleSort2(arr);
		
		System.out.println("=======================================");
		int arr1[]=sort.bubbleSort3();
		System.out.println("Array Elements After Sorting");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("===========================================");
		System.out.println("Enter Array length");
		int arr2[]=new int[scan.nextInt()];
		
		System.out.println("Enter Array Contents");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		
		int arr3[]=sort.bubbleSort4(arr2);
		System.out.println("Array Elements After Sorting");
		for(int i=0;i<=arr3.length-1;i++)
		{
			System.out.print(arr3[i]+" ");
		}


	}

}
