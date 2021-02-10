package Works;
import java.util.Scanner;

public class _2_3 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//校门外的树
		int arrayLength=in.nextInt();
		boolean roadArray[]=new boolean[arrayLength+1];		//默认false
		int m=in.nextInt();		//区间数
		int start,end,i,treeNum=0;
		for(int n=0;n<m;n++){
			start=in.nextInt();
			end=in.nextInt();
			for(i=start;i<=end;i++){
				if(roadArray[i]==false){
					roadArray[i]=true;
				}
			}
		}
		for(int a=0;a<=arrayLength;a++){
			if(roadArray[a]==false){
				treeNum++;
			}
		}
		System.out.println(treeNum);
		
	}

}
