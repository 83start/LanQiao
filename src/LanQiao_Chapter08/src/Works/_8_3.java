package Works;
import java.util.Scanner;

public class _8_3 {
	
	static String[] left=new String[3];
	static String[] right=new String[3];
	static String[] status=new String[3];
	
	public static void main(String[] args){
		//³ÆÓ²±Ò
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n!=0){
			for(int i=0;i<3;i++){
				left[i]=in.next();
				right[i]=in.next();
				status[i]=in.next();
				
			}
			
			for(char i='A';i<'Z';i++){
				if(isLight(i)){
					System.out.println((char)i+"	Light");
					break;
				}
				
				if(isHeavy(i)){
					System.out.println((char)i+"	Heavy");
					break;
				}
			}
			
		}
		
	}
	
	public static boolean isLight(char c){
		for(int i=0;i<3;i++){
			if(status[i].equals("even")){
				if(left[i].contains(c+"")||right[i].contains(c+""))
					return false;
			}
			if(status[i].equals("up")){
				if(!right[i].contains(c+""))
					return false;
			}
			if(status[i].equals("down")){
				if(!left[i].contains(c+""))
					return false;
			}
		}
		return true;
	}
	
	public static boolean isHeavy(char c){
		for(int i=0;i<3;i++){
			if(status[i].equals("even")){
				if(left[i].contains(c+"")||right[i].contains(c+""))
					return false;
			}
			if(status[i].equals("up")){
				if(!left[i].contains(c+""))
					return false;
			}
			if(status[i].equals("down")){
				if(!right[i].contains(c+""))
					return false;
			}
		}
		return true;
	}

}
