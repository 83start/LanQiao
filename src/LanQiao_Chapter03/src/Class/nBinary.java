package Class;

import java.util.Scanner;

public class nBinary {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//N����ת��Ϊʮ���ƣ�
		System.out.print("��������ƣ�");
		int n=in.nextInt();
		System.out.print("������һ��"+n+"��������");
		String bstr=in.next();
		
		System.out.println("����ʮ���Ʊ�ʾΪ��"+nBinaryToDec(n,bstr));
		

	}
	
	public static int nBinaryToDec(int n,String bstr){
		int sum=0;
		for(int i=0;i<bstr.length();i++){
			sum+=(bstr.charAt(bstr.length()-i-1)-'0')*Math.pow(n, i);		//�ַ�������-'0'���Եõ���������
		}
		return sum;
		
	}

}
