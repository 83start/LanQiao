package Works;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//不吉利的日期：
		int[] monthday={31,28,31,30,31,30,31,31,30,31,30,31};
		int days=12;
		int w=in.nextInt();
		for(int i=1;i<13;i++){
			if((days+w)%7==5)
				System.out.println(i);
			days+=monthday[i-1];
		}
		
		
		
		
	}

}
