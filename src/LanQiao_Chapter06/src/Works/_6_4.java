package Works;
import java.util.Scanner;

public class _6_4 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		for(int i=0;i<m;i++){
			int n=0,k=0;		//n是排列的数字个数，k是下面第k个排列
			n=in.nextInt();
			k=in.nextInt();
			
			//使用数组存放初始排列：
			int[] num=new int[n];
			for(int j=0;j<n;j++){
				num[j]=in.nextInt();
			}
			
			for(int j=0;j<k;j++){
				int index1,index2,temp,a;
				if(maxIndex(num)!=-1){
					a=index1=index2=temp=0;
					//从右向左找出i<i+1的数：
					a=index1=maxIndex(num);
					//找出比上值小的数：	
					index2=minIndex(num[index1],num);
					//交换：
					temp=num[index1];
					num[index1]=num[index2];
					num[index2]=temp;
					//将a后的数重新按从小到大排列：
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
	
	public static void littleToHigh(int x,int[] a){		//x：从第几位开始更改，a[]：原数组
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
