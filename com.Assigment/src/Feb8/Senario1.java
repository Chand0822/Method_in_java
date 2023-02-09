package Feb8;
import java.util.Scanner;
public class Senario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[6];                        // declare a int type array of size 6
     Scanner scan =new Scanner(System.in);
     System.out.println("Enter 1st Student Marks");
          arr[0]=scan.nextInt();                      // taking user input in array
     
     System.out.println("Enter 2st Student Marks");
     arr[1]=scan.nextInt();
     System.out.println("Enter 3st Student Marks");
     arr[2]=scan.nextInt();
     System.out.println("Enter 4st Student Marks");
     arr[3]=scan.nextInt();
     System.out.println("Enter 5st Student Marks");
     arr[4]=scan.nextInt();
     System.out.println("Enter 6st Student Marks");
     arr[5]=scan.nextInt();
     System.out.println("*****************************************");
	System.out.println("Marks of 6 student are below:- "); // displaying output of all array
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	System.out.println(arr[5]);
	
	scan.close();
	}

}
