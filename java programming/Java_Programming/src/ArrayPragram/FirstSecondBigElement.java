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

}
}
