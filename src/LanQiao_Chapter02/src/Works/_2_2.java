package Works;
import java.util.Scanner;

public class _2_2 {
	public static void main(String[] args){
		//2.2例题：棋盘上的距离：
		Scanner in=new Scanner(System.in);
		int cases=in.nextInt();
		int i,xStart,xEnd,yStart,yEnd,x,y;
		int wang,hou,che;
		String xiang=new String();
		String start=new String(),end=new String();
		for(i=0;i<cases;i++){
			start=in.next();
			xStart=start.charAt(0);		//读取开始的x坐标
			yStart=start.charAt(1);		//读取开始的y坐标
			end=in.next();
			xEnd=end.charAt(0);		//读取结束的x坐标
			yEnd=end.charAt(1);		//读取结束的y坐标
			x=Math.abs(xEnd-xStart);		//计算x轴的距离
			y=Math.abs(yEnd-yStart);		//计算y轴的距离
			if(x==0&&y==0){
				wang=hou=che=0;
				xiang="0";
			}	
			else{
				//王：
				if(x>y)
					wang=x;
				else
					wang=y;
				//后：
				if(x==0||y==0||x==y)
					hou=1;
				else
					hou=2;
				//车：
				if(x==0||y==0)
					che=1;
				else
					che=2;
				//象：
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
