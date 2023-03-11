package com.NumberSystem;

import java.util.Scanner;

public class NegativeOrPositive {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number to check a number is positive or negative");
	int num=s.nextInt();
	if(num>0)
		System.out.println("positive number");
	else
	System.out.println("negative number");
}
}
