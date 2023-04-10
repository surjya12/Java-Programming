package StringPrograms;

public class RemoveSpace {
	public static void main(String[] args) {
		String s="surjya is a good boy";
		String s1="";
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ')
				s1=s1+ch[i];
		}
		System.out.println(s1);
	}

}
