package StringPrograms;

import java.util.Scanner;

public class ConvertLowerString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.nextLine();
		char []ch=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
				
			}
			st=new String(ch);
		}
		System.out.println(st);
	}

}
