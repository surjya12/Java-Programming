package com.NumberSystem;

import java.util.Scanner;

public class BiggestInterger {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter three integer number");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		int big=num1;
		if(num2>big)
			big=num2;
		if(num3>big)
			big=num3;
		
		System.out.println("The biggest integer number is"+big);
	}

}
