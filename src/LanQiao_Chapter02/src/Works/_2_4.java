package Works;
import java.util.Scanner;

public class _2_4 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//填词
		int[] word=new int[26];
		int y=in.nextInt();
		int x=in.nextInt();
		int z=in.nextInt();
		int j,k=0,j1;
		int wordNum=x*y;
		String inStr;
		char[] input=new char[wordNum];
		//读取输入的字母放在数组input里：
		for(int i=0;i<=x;i++){
			inStr=in.next();
			for(j=0;j<=y;j++){
				input[k]=inStr.charAt(j);
				k++;
			}
		}
		//
		for(int a=0;a<=z;a++){
			inStr=in.next();
			for(j1=0;j1<inStr.length();j1++){
				for(k=0;;k++){
					if(input[k]==inStr.charAt(j1)){
						input[k]='0';
					}
				}
				
			}
		}
		
		
		
		
	}

}
