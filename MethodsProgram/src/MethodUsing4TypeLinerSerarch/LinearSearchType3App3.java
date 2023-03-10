package MethodUsing4TypeLinerSerarch;
public class LinearSearchType3App3 {

	public static void main(String[] args) {
		LinearSearchType3 search=new LinearSearchType3();		
		int res=search.linearSearch();
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
