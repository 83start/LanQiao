package Works;
import java.util.Scanner;

public class _2_1 {
	public static void main(String[] args){
		//2.1���⣺����ͬ����
		Scanner in=new Scanner(System.in);
		int cases=in.nextInt();		//������Ե�����
		int feet=0,i;
		for(i=0;i<cases;i++){
			feet=in.nextInt();		//�������
			if((feet%2)!=0)		//�жϽ����Ƿ�Ϊ����
				System.out.println("0 0");
			else
				System.out.println((feet/4+(feet%4)/2)+" "+feet/2);		//���㶯����࣬��������
			
		}
		
	}

}
