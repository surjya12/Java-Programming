package com.NumberSystem;

import java.util.Scanner;

//Write a program to check user enter number is digit or number

public class DigitOrNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number or digit");
		int num=s.nextInt();
		
		
		if(num<=9 && num>=-9)
			System.out.println("digit");
		else
		System.out.println("number");
	}

}
