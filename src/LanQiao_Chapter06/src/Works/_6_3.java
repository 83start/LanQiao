package Works;
import java.util.Scanner;

public class _6_3 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int s=0;
		String n=new String();		//s是尺寸，n是要显示的数
		
		//表示笔画：
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
			
			//用数组存放要显示的数：
			int[] printNum=new int[n.length()];
			for(int i=0;i<n.length();i++){
				printNum[i]=n.charAt(i)-'0';
			}
			
			//显示横的第一部分：
			System.out.println(heng(s,0,printNum,str));
			//显示竖的第一部分：
			for(int i=0;i<s;i++){
				System.out.println(shu(s,1,2,printNum,str));
			}
			//显示横的第二部分：
			System.out.println(heng(s,3,printNum,str));
			//显示竖的第二部分：
			for(int i=0;i<s;i++){
				System.out.println(shu(s,4,5,printNum,str));
			}
			//显示横的第三部分：
			System.out.println(heng(s,6,printNum,str));
			
		}
	}
	
	public static String heng(int a,int b,int[] c,String[][] d){		//a是尺寸，b是要打印笔画数组的位置，c[]是要表示的数，d[][]是笔画数组
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
	
	public static String shu(int a,int b,int c,int[] d,String[][] e){		//a是尺寸，b，c是要打印笔画数组的位置，d[]是要表示的数，e[][]是笔画数组
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
