package ArrayPragram;

import java.util.Scanner;

public class DeleteElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int []arr=new int[size];
		System.out.println("enter the element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("Array elementas are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("enter the index to delete an element");
		int in=s.nextInt();
		arr=Delete(arr,in);
		System.out.println("after delete elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}
	static int[] Delete(int []arr, int in) {
		if(in<0 || in>arr.length) {
			System.out.println("invalid index");
			return arr;
		}
		else {
			int arr1[]=new int[arr.length-1];
			for(int i=0;i<in;i++) {
				arr1[i]=arr[i];
			}
			for(int i=in;i<arr.length;i++) {
				arr1[i-1]=arr[i];
			}
			return arr1;
		}
		
			
	}

}
