package Feb17;
import java.util.Scanner;
public class ThreeDJaggedArray {
	public static void main(String[] args) {
	/*	Scanner s=new Scanner(System.in);
		System.out.println("Entr 3d jagged array lenth");
		int arr[][][]=new int[s.nextInt()][][];
		
		System.out.println("Entr 2d jagged array lenth");
		for(int i=0;i<=arr.length-1;i++) {
		arr[i]=new int[s.nextInt()][];
		}
		
		System.out.println("Entr 1d jagged array lenth");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) {
			arr[i][j]=new int[s.nextInt()];
			}
		}
		
		
		System.out.println("Enter the ellement of arry");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the value to store in array at index ["+i+"]["+j+"]["+k+"]");
					arr[i][j][k]=s.nextInt();
				}
			}
			
		}
		
		System.out.println("Array elament are...");
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
		*/	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1D length to create three Dimension JAGGED array");
		
		//Creating 3D Array by taking length as input		
		int arr[][][]=new int[scan.nextInt()][][];
		
		//taking 2D length and creating array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter 2D length for 1st D "+i);
			arr[i]=new int[scan.nextInt()][];
		}
		
		//for each 1st and 2nd D taking 3D length and creating array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the 3D length for 1D "+i+" 2D "+j);
				arr[i][j]=new int[scan.nextInt()];
			}
		}		
		//Taking Array Elements as Input From Keyboard And Storing in array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("enter the value to store in array at index arr["+i+"]["+j+"]["+k+"]");
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		
		
		//Displaying Array Content....
		
		System.out.println("Array Contents Are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
     scan.close();
	}

}
