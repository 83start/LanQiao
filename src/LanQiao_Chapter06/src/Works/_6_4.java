package Works;
import java.util.Scanner;

public class _6_4 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		for(int i=0;i<m;i++){
			int n=0,k=0;		//n�����е����ָ�����k�������k������
			n=in.nextInt();
			k=in.nextInt();
			
			//ʹ�������ų�ʼ���У�
			int[] num=new int[n];
			for(int j=0;j<n;j++){
				num[j]=in.nextInt();
			}
			
			for(int j=0;j<k;j++){
				int index1,index2,temp,a;
				if(maxIndex(num)!=-1){
					a=index1=index2=temp=0;
					//���������ҳ�i<i+1������
					a=index1=maxIndex(num);
					//�ҳ�����ֵС������	
					index2=minIndex(num[index1],num);
					//������
					temp=num[index1];
					num[index1]=num[index2];
					num[index2]=temp;
					//��a��������°���С�������У�
					littleToHigh(a+1,num);
					
				}
				else{
					littleToHigh(0,num);
				}
				
			}
			
			for(int a:num){
				System.out.print(a+" ");
			}
			System.out.println();
			
		}
		
	}
	
	public static int maxIndex(int[] a){
		for(int j=a.length-1;j>0;j--){
			if(a[j]>a[j-1])
				return j-1;
		}
		return -1;
	}
	
	public static int minIndex(int b,int[] a){
		for(int j=a.length-1;j>=0;j--){
			if(a[j]>b)
				return j;
		}
		return -1;
	}
	
	public static void littleToHigh(int x,int[] a){		//x���ӵڼ�λ��ʼ���ģ�a[]��ԭ����
		int[] b=new int[a.length-x];
		for(int i=0;i<a.length-x;i++){
			int lowIndex=x;
			for(int j=x;j<a.length;j++){
				if(a[lowIndex]>a[j]&&a[j]!=-1)
					lowIndex=j;
			}
			b[i]=a[lowIndex];
			a[lowIndex]=-1;
		}
		for(int i=0;i<b.length;i++){
			a[i+x]=b[i];
		}
		
	}

}
