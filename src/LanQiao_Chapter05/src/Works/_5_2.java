package Works;
import java.util.Scanner;

public class _5_2 {
	public static void main(String[] args){
		//Ï¸¾ú·±Ö³
		int[] monthday={31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner in=new Scanner(System.in);
		int month1=in.nextInt();
		int date1=in.nextInt();
		int num=in.nextInt();
		int month2=in.nextInt();
		int date2=in.nextInt();
		int days=0;
		for(int i=month1;i<month2;i++){
			days+=monthday[i-1];
		}
		days-=date1;
		days+=date2;
		for(int i=0;i<days;i++){
			num*=2;
		}
		System.out.println(num);
		
		
	}

}
