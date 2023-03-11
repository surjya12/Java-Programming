package ArrayPragram;

import java.util.Scanner;

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
		
		for(int i=arr.length;i>=index-1;i--) {
			arr1[i]=arr[i-1];
		}
		arr1[index-1]=ele;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
