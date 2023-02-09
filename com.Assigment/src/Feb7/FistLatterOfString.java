package Feb7;
import java.util.Scanner;
public class FistLatterOfString {
	public static void main(String[] args) {
	Scanner	scan= new Scanner(System.in);
	System.out.println("Enter a String Value : ");
    String s=scan.nextLine();  // here taking input from keyboard as string
    
    /* NOTE: - The charAt() method returns the character at the specified index in a string.
      The index of the first character is 0, the second character is 1, and so on.
    */
    
	char ch=s.charAt(0);      // here string convert into character and "0"th position will print   
    System.out.println("fist Character of String : "+ch);
	scan.close();

	}

}
