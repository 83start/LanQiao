package Class;

import java.util.Scanner;

public class nBinary {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//N进制转换为十进制：
		System.out.print("请输入进制：");
		int n=in.nextInt();
		System.out.print("请输入一个"+n+"进制数：");
		String bstr=in.next();
		
		System.out.println("它的十进制表示为："+nBinaryToDec(n,bstr));
		

	}
	
	public static int nBinaryToDec(int n,String bstr){
		int sum=0;
		for(int i=0;i<bstr.length();i++){
			sum+=(bstr.charAt(bstr.length()-i-1)-'0')*Math.pow(n, i);		//字符型数字-'0'可以得到它的整型
		}
		return sum;
		
	}

}
