package Works;
import java.util.Scanner;

public class _5_1 {
	public static void main(String[] args){
		//�ж�����
		Scanner in=new Scanner(System.in);
		String[] dayOfWeek={"������","������","����һ","���ڶ�","������","������","������"};
		int[][] monthDay={{31,28,31,30,31,30,31,31,30,31,30,31},
				{31,29,31,30,31,30,31,31,30,31,30,31}};
		int[] yearDay={365,366};
		int days=in.nextInt();
		String weekday=dayOfWeek[days%7];
		int i;
		for(i=2000;days>=yearDay[type(i)];i++){
			days-=yearDay[type(i)];
		}
		int j;
		for(j=1;days>=monthDay[type(i)][j-1];j++){
			days-=monthDay[type(i)][j-1];
		}
		int date=days+1;
		System.out.printf("%d-%02d-%02d %s",i,j,date,weekday);
		
		
	}
	
	public static int type(int year){
		if((year%4==0&&year%100!=0)||(year%400==0))
			return 1;
		else
			return 0;
	}

}
