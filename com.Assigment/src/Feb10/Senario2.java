package Feb10;
import java.util.Scanner;
public class Senario2 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("Enter Name of the Players :");
			Scanner s=new Scanner(System.in);
			String arr[]=new String[8];   // String type of array of size 8  
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println(" Name of the Players :" +i);
				arr[i]=s.nextLine();                         // taking input in array as string      
				
			}
			System.out.println("The containt of array :");
			System.out.print("Players  name in arry-->");
			
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.print(arr[i]+" ");  // just printing the out put of the data of array
			}
			
			s.close();

		}

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
