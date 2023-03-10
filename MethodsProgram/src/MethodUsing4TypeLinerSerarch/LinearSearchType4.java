package MethodUsing4TypeLinerSerarch;

public class LinearSearchType4 {
	int linearSearch(int arr[],int key)
	{		//logic of linear search
		
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
