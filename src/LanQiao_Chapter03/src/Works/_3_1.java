package Works;
import java.util.Scanner;

public class _3_1 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//�������ֵĻ����ȱȣ�ȷ������
		int cases=in.nextInt();
		int n,p1,q1,r1,pN=0,qN=0,rN=0;
		int[] pArray,qArray,rArray;
		for(int i=0;i<cases;i++){
			//��ȡ�ַ�����
			String pStr=in.next();
			String qStr=in.next();
			String rStr=in.next();
			//ȷ�����鳤�ȣ�
			pArray=new int[pStr.length()];
			qArray=new int[qStr.length()];
			rArray=new int[rStr.length()];
			//��ʼ�����飺
			for(int a=0;a<pStr.length();a++){
				pArray[pStr.length()-a-1]=pStr.charAt(pStr.length()-a-1)-'0';
			}
			for(int b=0;b<qStr.length();b++){
				qArray[qStr.length()-b-1]=qStr.charAt(qStr.length()-b-1)-'0';
			}
			for(int c=0;c<rStr.length();c++){
				rArray[rStr.length()-c-1]=rStr.charAt(rStr.length()-c-1)-'0';
			}
			//���Խ��ƣ�
			for(n=2;n<=16;n++){		//�ж��ڴ˽����£��������Ƿ��������2���Ƶ�7��!!!!121���Ƕ����ƣ�����
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

//ѧϰ������ʹ�÷�����д��
