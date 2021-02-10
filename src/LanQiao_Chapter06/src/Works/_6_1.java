package Works;
import java.util.Scanner;

public class _6_1 {
	public static void main(String[] args){
		//约瑟夫问题：
		Scanner in=new Scanner(System.in);
		int m=0,n=0;
		for(;;){
			n=0;
			m=0;
			n=in.nextInt();
			m=in.nextInt();
			if(m==0&&n==0)break;
			
			//初始化数组：
			int[] array=new int[n];
			for(int i=0;i<n;i++){
				array[i]=i+1;
			}
			
			//处理数组：
			for(int t=0,j=0;t<n-1;){		//第一层循环的循环条件是删除的数字不足n-1个
				for(int i=0;i<n;i++){		//第二层循环负责遍历数组
					if(array[i]==0)		//当数组数为零时，跳过本次循环
						continue;
					else
						j++;
					
					if(j%m==0&&j!=0){
						array[i]=0;
						t++;		//t代表已经删除了几个数字
					}
					
					if(t==n-1)break;		//判断删除的数字是否达到n-1个
				}	
			}
			
			//输出最后剩余数字的序号
			for(int i=0;i<n;i++){
				if(array[i]!=0){
					System.out.println(i+1);break;
				}
			}

		}
		
		
	}
}
