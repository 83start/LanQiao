package Works;
import java.util.Scanner;

public class _2_2 {
	public static void main(String[] args){
		//2.2���⣺�����ϵľ��룺
		Scanner in=new Scanner(System.in);
		int cases=in.nextInt();
		int i,xStart,xEnd,yStart,yEnd,x,y;
		int wang,hou,che;
		String xiang=new String();
		String start=new String(),end=new String();
		for(i=0;i<cases;i++){
			start=in.next();
			xStart=start.charAt(0);		//��ȡ��ʼ��x����
			yStart=start.charAt(1);		//��ȡ��ʼ��y����
			end=in.next();
			xEnd=end.charAt(0);		//��ȡ������x����
			yEnd=end.charAt(1);		//��ȡ������y����
			x=Math.abs(xEnd-xStart);		//����x��ľ���
			y=Math.abs(yEnd-yStart);		//����y��ľ���
			if(x==0&&y==0){
				wang=hou=che=0;
				xiang="0";
			}	
			else{
				//����
				if(x>y)
					wang=x;
				else
					wang=y;
				//��
				if(x==0||y==0||x==y)
					hou=1;
				else
					hou=2;
				//����
				if(x==0||y==0)
					che=1;
				else
					che=2;
				//��
				if((x-y)%2!=0)
					xiang="Inf";
				else if(x==y)
					xiang="1";
				else
					xiang="2";
			}
			System.out.println(wang+" "+hou+" "+che+" "+xiang);
			
		}
		
	}

}
