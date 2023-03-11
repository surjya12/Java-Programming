package com.NumberSystem;

import java.util.Scanner;

//write a program to check user enter number is special two digit or not

public class SpecialTwoDigitOrNot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number to check special digit or not");
		int num=s.nextInt();
		int d1=num/10;
		int d2=num%10;
		int sum=d1+d2+d1*d2;
		
		if(sum==num)
			System.out.println("special digit");
		else
		System.out.println("Not special digit");
	}

}
