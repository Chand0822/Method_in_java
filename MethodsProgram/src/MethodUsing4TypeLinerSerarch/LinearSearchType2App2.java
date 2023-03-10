package MethodUsing4TypeLinerSerarch;

import java.util.Scanner;

public class LinearSearchType2App2 {

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
		LinearSearchType2 search=new LinearSearchType2();
		
		search.linearSearch(arr,key);
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter lenth in a and key in b");
		int a=scan.nextInt();
		int b=scan.nextInt();
		LinearSearchType2 ls=new LinearSearchType2();
		ls.linearSearch(a, b);
*/
	}

}
