package com.NumberSystem;

import java.util.Scanner;

public class EverOrOdd {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number to check even or odd");
	int num=s.nextInt();
	if(num%2==0)
		System.out.println("Even number");
	else 
	System.out.println("Odd number");
}
}
