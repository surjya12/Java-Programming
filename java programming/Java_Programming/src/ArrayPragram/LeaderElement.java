package ArrayPragram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LeaderElement {
	public static void main(String[] args) {
	int []arr= {15,16,3,2,6,1,4};
	
	
	for(int i=0;i<arr.length;i++) {
		int big=arr[i];
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j])
				big=arr[j];
		}
		if(arr[i]==big)
			System.out.println(big);
	}
	
	}
}
