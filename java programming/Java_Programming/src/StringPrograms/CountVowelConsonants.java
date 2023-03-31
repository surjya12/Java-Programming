package StringPrograms;

import java.util.Scanner;

public class CountVowelConsonants {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any string");
	String st=s.nextLine();
	int vc=0,cc=0;
	
	for(int i=0;i<st.length();i++) {
		char ch=st.charAt(i);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='z') {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				vc++;
			}
			else 
				cc++;
		}
	}
	System.out.println(vc);
	System.out.println(cc);
}
}
