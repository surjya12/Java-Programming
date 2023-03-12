package ArrayPragram;

import java.util.Scanner;

//Write a program to INSERT A ELEMENT INTO EXISTING ARR Write a program to INSERT A ELEMENT INTO EXISTING ARRAY in a specified AY in a specified
//position?


public class InsertElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int []arr=new int[size];
		int []arr1=new int[size+1];
		System.out.println("enter the element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("enter the index ");
		int index=s.nextInt();
		System.out.println("enter the element ");
		int ele=s.nextInt();
		
		for(int i=0;i<index;i++) {
			arr1[i]=arr[i];
		}
		arr1[index]=ele;
		for(int i=index+1;i<arr1.length;i++) {
			arr1[i]=arr[i-1];
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		
	}

}
