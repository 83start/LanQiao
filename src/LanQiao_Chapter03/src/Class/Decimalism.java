package Class;
import java.util.Scanner;

public class Decimalism {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//ʮ����ת��Ϊ�������ƣ�
		System.out.print("������һ��ʮ���Ƶ�����");
		int dec=in.nextInt();
		System.out.print("��������ƣ�");
		int n=in.nextInt();
		System.out.println("ʮ������"+dec+"ת��Ϊ"+n+"����Ϊ��"+decToNBinary(dec,n));
		

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
