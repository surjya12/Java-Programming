package com.NumberSystem;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		boolean res=IsStrongNumber(num);
		if(res)
			System.out.println("Strong Number");
		else
		System.out.println("Not Strong Number");
	}
	static boolean IsStrongNumber(int num) {
		int fact=1;
		int sum=0;
		int temp=num;
		while(num!=0) {
			int d=num%10;
			for(int i=1;i<=d;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
			fact=1;
		}
		return temp==sum;
	}

}
