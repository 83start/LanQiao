package Works;
import java.util.Scanner;

public class _3_1 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//相邻数字的基数等比：确定进制
		int cases=in.nextInt();
		int n,p1,q1,r1,pN=0,qN=0,rN=0;
		int[] pArray,qArray,rArray;
		for(int i=0;i<cases;i++){
			//读取字符串：
			String pStr=in.next();
			String qStr=in.next();
			String rStr=in.next();
			//确定数组长度：
			pArray=new int[pStr.length()];
			qArray=new int[qStr.length()];
			rArray=new int[rStr.length()];
			//初始化数组：
			for(int a=0;a<pStr.length();a++){
				pArray[pStr.length()-a-1]=pStr.charAt(pStr.length()-a-1)-'0';
			}
			for(int b=0;b<qStr.length();b++){
				qArray[qStr.length()-b-1]=qStr.charAt(qStr.length()-b-1)-'0';
			}
			for(int c=0;c<rStr.length();c++){
				rArray[rStr.length()-c-1]=rStr.charAt(rStr.length()-c-1)-'0';
			}
			//测试进制：
			for(n=2;n<=16;n++){		//判断在此进制下，进制数是否出错（例如2进制的7）!!!!121不是二进制！！！
				pN=0;
				qN=0;
				rN=0;
				for(p1=0;p1<pStr.length();p1++){
					if(pArray[pStr.length()-p1-1]>=n){
						pN=-1;break;
					}
					pN+=pArray[pStr.length()-p1-1]*Math.pow(n, p1);
				}
				for(q1=0;q1<qStr.length();q1++){
					if(qArray[qStr.length()-q1-1]>=n){
						qN=-1;break;
					}
					qN+=qArray[qStr.length()-q1-1]*Math.pow(n, q1);
				}
				for(r1=0;r1<rStr.length();r1++){
					if(rArray[rStr.length()-r1-1]>=n){
						rN=-1;break;
					}
					rN+=rArray[rStr.length()-r1-1]*Math.pow(n, r1);
				}
				if(pN==-1||qN==-1||rN==-1){
					continue;
				}
				else if(pN*qN==rN){
					System.out.println(n);
					break;
				}
				
			}
			if(n==17){
				System.out.println("0");
			}
			
		}
		
		
	}

}

//学习方法后使用方法改写。
