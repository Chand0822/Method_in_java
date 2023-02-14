package Feb14;
import java.util.Scanner;
public class JaggesArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[4][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[5];
				for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
		      System.out.println("Enter age of "+i +" Student : "+j );
		    
		         arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Array containt are ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
		      System.out.print(arr[i][j]+ " " );    
			}
			System.out.println();
		}
		s.close();
	}

}
