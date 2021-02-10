package Work;
import java.util.Scanner;

public class _4_2 {
	public static void main(String[] args){
		//Í³¼Æ×Ö·ûÊý
		Scanner in=new Scanner(System.in);
		int times=in.nextInt();
		String str1=new String();
		int[] word;
		int num;
		for(int i=0;i<times;i++){
			num=0;
			word=new int[26];
			str1=in.next();
			for(int m=0;m<str1.length();m++){
				word[(str1.charAt(m)-'a')]++;
			}
			for(int n=0;n<26;n++){
				if(word[num]<word[n])
					num=n;
			}
			System.out.println((char)(num+'a')+" "+word[num]);
		}
		
		
	}

}
