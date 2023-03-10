package ImportantProgramOnString;
import java.util.Scanner;
public class SpaceBetweenStrings {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		
		char arr1[]=str.toCharArray();
		char arr2[]=new char[arr1.length];
		
		//copying the space from arr1 to arr2
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]==' ')
			{
				arr2[i]=arr1[i];
			}
		}
		
		
		//Copy the contents from arr1 to arr2 in reverse direction
		
		int j=arr2.length-1;
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]!=' ')
			{
				if(arr2[j]==' ')
				{
					j--;
				}
				arr2[j]=arr1[i];
				j--;
				
			}
		}
		System.out.println("ORIGINAL STRING "+str);
		str=new String(arr2);
		System.out.println("REVERSED STRING "+str);
		
		
		scan.close();

	}

}
