package Pattern;

import java.util.Scanner;

   
//   *              Output
//  * *
// * * *
//* * * *

public class PyramidStar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to print the star pattern");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(j>i)
					System.out.print(" ");
				else
					System.out.print(" *");
			}
			System.out.println();
		}
	}

}
