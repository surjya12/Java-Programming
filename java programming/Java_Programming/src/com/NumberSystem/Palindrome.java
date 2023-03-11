package com.NumberSystem;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to check prime or not ");
		int num=s.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0) {
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("palindrome");
		else
		System.out.println("not palindrome");
		
		
	}
}
