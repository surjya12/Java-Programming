package com.NumberSystem;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number to check prime or not ");
	int num=s.nextInt();
	int count=0;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0)
			count++;
	}
	if(count>1)
		System.out.println("Not prime number");
	else
		System.out.println("prime number");
	
}
}
