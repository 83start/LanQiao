package Works;
import java.util.Scanner;

public class _6_3 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int s=0;
		String n=new String();		//s�ǳߴ磬n��Ҫ��ʾ����
		
		//��ʾ�ʻ���
		String[][] str={{"-"," ","-","-"," ","-","-","-","-","-"},
				{"|"," "," "," ","|","|","|"," ","|","|"},
				{"|","|","|","|","|"," "," ","|","|","|"},
				{" "," ","-","-","-","-","-"," ","-","-"},
				{"|"," ","|"," "," "," ","|"," ","|"," "},
				{"|","|"," ","|","|","|","|","|","|","|"},
				{"-"," ","-","-"," ","-","-"," ","-","-"}};
		
		for(;;){
			s=in.nextInt();
			n=in.next();
			if(s==0&&n.equals("0"))break;
			
			//��������Ҫ��ʾ������
			int[] printNum=new int[n.length()];
			for(int i=0;i<n.length();i++){
				printNum[i]=n.charAt(i)-'0';
			}
			
			//��ʾ��ĵ�һ���֣�
			System.out.println(heng(s,0,printNum,str));
			//��ʾ���ĵ�һ���֣�
			for(int i=0;i<s;i++){
				System.out.println(shu(s,1,2,printNum,str));
			}
			//��ʾ��ĵڶ����֣�
			System.out.println(heng(s,3,printNum,str));
			//��ʾ���ĵڶ����֣�
			for(int i=0;i<s;i++){
				System.out.println(shu(s,4,5,printNum,str));
			}
			//��ʾ��ĵ������֣�
			System.out.println(heng(s,6,printNum,str));
			
		}
	}
	
	public static String heng(int a,int b,int[] c,String[][] d){		//a�ǳߴ磬b��Ҫ��ӡ�ʻ������λ�ã�c[]��Ҫ��ʾ������d[][]�Ǳʻ�����
		String str1=new String();
		for(int i=0;i<c.length;i++){
			str1+=" ";
			for(int j=0;j<a;j++){
				str1+=d[b][c[i]];
			}
			str1+="  ";
		}
		return str1;
	}
	
	public static String shu(int a,int b,int c,int[] d,String[][] e){		//a�ǳߴ磬b��c��Ҫ��ӡ�ʻ������λ�ã�d[]��Ҫ��ʾ������e[][]�Ǳʻ�����
		String str1=new String();
		for(int i=0;i<d.length;i++){
			str1+=e[b][d[i]];
			for(int j=0;j<a;j++){
				str1+=" ";
			}
			str1+=e[c][d[i]];
			str1+=" ";
		}
		return str1;
	}

}
