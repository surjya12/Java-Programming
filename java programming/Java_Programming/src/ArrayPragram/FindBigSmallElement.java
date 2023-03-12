package ArrayPragram;

import java.util.Scanner;

public class FindBigSmallElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayOperation ao=new ArrayOperation();
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int arr[]=ao.arrayread(size);
		ao.displayarray(arr);
		int big=Biggest(arr);
		System.out.println("the biggest element "+big);
		int small=Smallest(arr);
		System.out.println("the Smallest element "+small);
	}
	static int Smallest(int arr[]) {
		int small=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small)
				small=arr[i];
		}
		return small;
	}
	static int Biggest(int arr[]) {
		int big=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>big)
				big=arr[i];
		}
		return big;
	}

}
