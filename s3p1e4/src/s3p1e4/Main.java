package s3p1e4;
import java.util.*;
public class Main {
	public static String str;
	public static int len;
	
	static char[] queue=new char[10000];
	static char[] l1={'1'};
	static char[] l0={'0'};
	static char[] l2={'2','a','b','c'};
	static char[] l3={'3','d','e','f'};
	static char[] l4={'4','g','h','i'};
	static char[] l5={'5','j','k','l'};
	static char[] l6={'6','m','n','o'};
	static char[] l7={'7','p','q','r','s'};
	static char[] l8={'8','t','u','v'};
	static char[] l9={'9','w','x','y','z'};

	public static void dfs(int deep){
		char[] temp = null;
		if(deep==len){
			for(int j=0;j<deep;j++){
				System.out.print(queue[j]);
			}
			System.out.print("\n");
		}
		else{
			if(str.charAt(deep)=='1'){
				temp=l1;
			}
			else if(str.charAt(deep)=='2'){
				temp=l2;
			}
			else if(str.charAt(deep)=='3'){
				temp=l3;
			}
			else if(str.charAt(deep)=='4'){
				temp=l4;
			}
			else if(str.charAt(deep)=='5'){
				temp=l5;
			}
			else if(str.charAt(deep)=='6'){
				temp=l6;
			}
			else if(str.charAt(deep)=='7'){
				temp=l7;
			}
			else if(str.charAt(deep)=='8'){
				temp=l8;
			}
			else if(str.charAt(deep)=='9'){
				temp=l9;
			}
			else if(str.charAt(deep)=='0'){
				temp=l0;
			}
			int l=temp.length;
			for(int i=0;i<l;i++){
				queue[deep]=temp[i];
				dfs(deep+1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		len=str.length();
		dfs(0);
	}

}
