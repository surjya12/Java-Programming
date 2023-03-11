package com.NumberSystem;

import java.util.Scanner;

public class DateValidOrNot {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the day");
	int day=s.nextInt();
	System.out.println("enter the month");
	int mon=s.nextInt();
	System.out.println("enter the year");
	int year=s.nextInt();
	if(day>31 || day<1 || mon>12 || year<1)
		System.out.println("Invalid date");
	else if((mon==4 || mon==6 || mon==9 || mon==11) && (day>30))
	System.out.println("Invalid date");
	else if(mon==2 && day>29)
		System.out.println("Invalid");
	else if((( year%4==0 && year%100!=0) || year%400==0 ) && (day>29))
	System.out.println("Invalid date");
	else 
		System.out.println("Valid");
}
}
