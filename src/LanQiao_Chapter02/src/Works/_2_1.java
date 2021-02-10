package Works;
import java.util.Scanner;

public class _2_1 {
	public static void main(String[] args){
		//2.1例题：鸡兔同笼：
		Scanner in=new Scanner(System.in);
		int cases=in.nextInt();		//输入测试的组数
		int feet=0,i;
		for(i=0;i<cases;i++){
			feet=in.nextInt();		//输入脚数
			if((feet%2)!=0)		//判断脚数是否为奇数
				System.out.println("0 0");
			else
				System.out.println((feet/4+(feet%4)/2)+" "+feet/2);		//计算动物最多，最少数量
			
		}
		
	}

}
