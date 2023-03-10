package Feb7;
import java.util.Scanner;
public class SpliteWordFromString {

	public static void main(String[] args) {
		Scanner	scan= new Scanner(System.in);
		System.out.println("Enter a String Value : ");
	    String s=scan.nextLine();
	   
	    //Note: - split() method breaks a given string around matches of the given regular expression
	    
	    String[] words=s.split(" ");
	    for(String x:words)
	    {
	    System.out.println(x);
	    }
		scan.close();

	}

}
