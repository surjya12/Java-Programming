package com.NumberSystem;

import java.util.Scanner;

public class SumOfEvenAndOdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int esum=0,osum=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0)
				esum=esum+i;
			else
				osum=osum+i;
			
		}
		System.out.println("the sum of odd number"+osum);
		System.out.println("the sum of even number"+esum);

}
}
