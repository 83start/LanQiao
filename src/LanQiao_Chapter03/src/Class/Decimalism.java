package Class;
import java.util.Scanner;

public class Decimalism {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//十进制转化为其他进制：
		System.out.print("请输入一个十进制的数：");
		int dec=in.nextInt();
		System.out.print("请输入进制：");
		int n=in.nextInt();
		System.out.println("十进制数"+dec+"转换为"+n+"进制为："+decToNBinary(dec,n));
		

	}
	
	public static String decToNBinary(int dec,int n){
		String nBinary=new String();
		while(dec!=0){
			nBinary=dec%n+nBinary;
			dec/=n;
		}
		return nBinary;
		
	}

}
