package Feb17;
import java.util.Scanner;
public class ThreeDArrayForUserInput {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter 1D and 2D and 3D lenth to cret an array");
		int arr[][][]=new int[s.nextInt()][s.nextInt()][s.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter value of array index ["+i+"]["+j+"]["+k+"]");
					arr[i][j][k]=s.nextInt();			
				}
			}
		}
		
		System.out.println("Array containt are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
			  for(int k=0;k<=arr[i][j].length-1;k++)
			  {
				  System.out.print(arr[i][j][k]);
			  }
				System.out.println();
			}
		}
		
		s.close();
	}

}
