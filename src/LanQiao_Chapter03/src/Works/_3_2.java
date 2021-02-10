package Works;
import java.util.Scanner;

public class _3_2 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//相邻数字的基数不等比：skew数
		int sum=0;
		String n;
		for(;;){
			n=in.next();
			if(n.equals("0")){
				break;	
			}
			sum=0;
			for(int i=0;i<n.length();i++){
				sum+=(n.charAt(n.length()-i-1)-'0')*(Math.pow(2,i+1)-1);
			}
			System.out.println(sum);
			
		}
		
		
	}

}
