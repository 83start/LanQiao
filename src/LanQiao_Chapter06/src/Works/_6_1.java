package Works;
import java.util.Scanner;

public class _6_1 {
	public static void main(String[] args){
		//Լɪ�����⣺
		Scanner in=new Scanner(System.in);
		int m=0,n=0;
		for(;;){
			n=0;
			m=0;
			n=in.nextInt();
			m=in.nextInt();
			if(m==0&&n==0)break;
			
			//��ʼ�����飺
			int[] array=new int[n];
			for(int i=0;i<n;i++){
				array[i]=i+1;
			}
			
			//�������飺
			for(int t=0,j=0;t<n-1;){		//��һ��ѭ����ѭ��������ɾ�������ֲ���n-1��
				for(int i=0;i<n;i++){		//�ڶ���ѭ�������������
					if(array[i]==0)		//��������Ϊ��ʱ����������ѭ��
						continue;
					else
						j++;
					
					if(j%m==0&&j!=0){
						array[i]=0;
						t++;		//t�����Ѿ�ɾ���˼�������
					}
					
					if(t==n-1)break;		//�ж�ɾ���������Ƿ�ﵽn-1��
				}	
			}
			
			//������ʣ�����ֵ����
			for(int i=0;i<n;i++){
				if(array[i]!=0){
					System.out.println(i+1);break;
				}
			}

		}
		
		
	}
}
