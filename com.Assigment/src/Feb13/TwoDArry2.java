package Feb13;
import java.util.Scanner;
public class TwoDArry2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String arr[][]=new String[7][5];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
		      System.out.println("Enter the bank:"+i +" and name of customer: "+j );
		    
		         arr[i][j]=s.next();
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
