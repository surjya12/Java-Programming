package ArrayPragram;

import java.util.Scanner;

public class SearchElement {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size=s.nextInt();
	int ar[]=new int[size];
	System.out.println("enter the element for array");
	for(int i=0;i<ar.length;i++) {
		ar[i]=s.nextInt();
	}
	System.out.println("enter the element to search");
	int sr=s.nextInt();
	int in=Search(ar,sr);
	System.out.println(in);
}
static int Search(int ar[],int sr) {
	
	for(int i=0;i<ar.length;i++) {
		if(ar[i]==sr)
			return i;
	}
	return -1;
}
}
