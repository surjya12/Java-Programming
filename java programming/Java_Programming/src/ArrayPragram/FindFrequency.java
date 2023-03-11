package ArrayPragram;

import java.util.Scanner;

public class FindFrequency { public FindFrequency() {
	// TODO Auto-generated constructor stub
}public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size=s.nextInt();
	int []arr=new int[size];
	int []fr=new int[arr.length];
	int visited=-1;
	System.out.println("enter the element for array");
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
			fr[j]=visited;
		}
	}
	  if(fr[i] != visited)  
          fr[i] = count;  

	
}
	  for(int i = 0; i < fr.length; i++){  
          if(fr[i] != visited)  
              System.out.println("    " + arr[i] +" "+ fr[i]);  
      }  
 

}
}
