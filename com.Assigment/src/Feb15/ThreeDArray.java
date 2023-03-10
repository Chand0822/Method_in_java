package Feb15;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][][]=new int[2][3][4];
		
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=0;j<=arr[i].length-1;j++) {
				
				for(int k=0;k<=arr[i][j].length-1;k++){
					System.out.println("Enter marks of school "+i+" ckass "+j+ " student "+k );
					arr[i][j][k]=s.nextInt();
				}
			}
		}
		
		System.out.println("Array containt are :");	
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=0;j<=arr[i].length-1;j++) {
				
				for(int k=0;k<=arr[i][j].length-1;k++){
					System.out.print(arr[i][j][k]+" ");
					
				}
				System.out.println();
			}
			System.out.println();
		}

        s.close();
	}

}
