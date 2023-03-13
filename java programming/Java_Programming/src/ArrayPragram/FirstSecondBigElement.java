package ArrayPragram;

import java.util.Scanner;

public class FirstSecondBigElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayOperation ao=new ArrayOperation();
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int arr[]=ao.arrayread(size);
		ao.displayarray(arr);
		int fbig=arr[0];
		int sbig=arr[1];
		for(int i=1;i<arr.length;i++) {
			if(fbig<arr[i]) {
				sbig=fbig;
				fbig=arr[i];
				
			}
			else if(sbig<arr[i]) {
				sbig=arr[i];
			}
		}
		System.out.println("the biggest element is "+fbig);
		System.out.println("the second biggest element is "+sbig);

}
}
