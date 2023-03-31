package StringPrograms;

import java.util.Scanner;

public class CountWordInString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.nextLine();
		int count=CountWord(st);
		System.out.println(count);
	}
	public static int CountWord(String st) {
		char []ch=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			  if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) ) {
				count++;
			}
			
		}
		return count;
	}

}
