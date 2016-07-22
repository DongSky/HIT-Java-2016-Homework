package s3p1e2;
import java.util.Scanner;
public class Main {
	public static String s1=new String();
	public static String s2=new String();
	public static String s3=new String();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int method;
		Scanner s=new Scanner(System.in);
		System.out.println("Input the first number:");
		s1=s.nextLine();
		System.out.println("Input the second number:");
		s2=s.nextLine();
		System.out.println("Input the calculate method(plus or sub)");
		s3=s.nextLine();
		if(s3.equals("plus")){
			method=1;
		}
		else{
			method=0;
		}
		cal(s1,s2,method);
	}
	public static void cal(String slong,String sshort,int method){
		int l1,l2,min,max,lower=0;
		int i,j,k,temp;
		int count=0;
		l1=s1.length();
		l2=s2.length();
		min=(l1>l2?l2:l1);
		max=(l1<l2?l2:l1);
		int[] result=new int[10000];
		for(i=0;i<10000;i++){
			result[i]=0;
		}
		if(method==1){
			for(i=1;i<=min;i++){
				temp=(s1.charAt(l1-i)-'0'+0)+(s2.charAt(l2-i)-'0'+0);
				result[10000-i]=result[10000-i]+temp%10;
				result[9999-i]=result[9999-i]+temp/10;
			}
			if(l1>l2){
				for(i=min+1;i<=max;i++){
					result[10000-i]=result[10000-i]+(s1.charAt(l1-i)-'0'+0);
				}
			}
			else if(l2>l1){
				for(i=min+1;i<=max;i++){
					result[10000-i]=result[10000-i]+(s2.charAt(l1-i)-'0'+0);
				}
			}
			for(i=0;i<10000;i++){
				if(result[i]!=0){
					break;
				}
			}
			if(i==10000){
				System.out.println(0);
			}
			else{
				for(;i<10000;i++){
					System.out.print(result[i]);
				}
				System.out.print("\n");		
			}		
		}
		else if(method==0){
			if(l1==l2){
				if(s1.compareTo(s2)<0){
					count=1;
					for(i=1;i<=min-1;i++){
						temp=(s2.charAt(l2-i)-'0'+0)-(s1.charAt(l1-i)-'0'+0);
						if(temp<0){
							result[10000-i]=10+temp;
							result[9999-i]--;
						}
						else{
							result[10000-i]=temp;
						}
					}
					temp=(s2.charAt(l2-i)-'0'+0)-(s1.charAt(l1-i)-'0'+0);
					result[10000-i]+=temp;
				}	
				else{
					for(i=1;i<=min-1;i++){
						temp=(s1.charAt(l1-i)-'0'+0)-(s2.charAt(l2-i)-'0'+0);
						if(temp<0){
							result[10000-i]=10+temp;
							result[9999-i]--;
						}
						else{
							result[10000-i]=temp;
						}
					}
					temp=(s1.charAt(l1-i)-'0'+0)-(s2.charAt(l2-i)-'0'+0);
					result[10000-i]+=temp;
				}
				for(i=0;i<10000;i++){
					if(result[i]!=0){
						break;
					}
				}
				if(i==10000){
					System.out.println(0);
				}
				else{
					if(count==1){
						System.out.print("-");
					}
					for(;i<10000;i++){
						System.out.print(result[i]);
					}
					System.out.print("\n");		
				}
			}
			else{
				if(l1>l2){
					for(i=1;i<=min;i++){
						temp=(s1.charAt(l1-i)-'0'+0)-(s2.charAt(l2-i)-'0'+0);
						if(temp<0){
							result[10000-i]=10+temp;
							result[9999-i]--;
						}
						else{
							result[10000-i]=temp;
						}
					}
					for(i=min+1;i<=max;i++){
						result[10000-i]=result[10000-i]+(s1.charAt(l1-i)-'0'+0);
					}
					
				}
				else if(l2>l1){
					count=1;
					for(i=1;i<=min;i++){
						temp=(s2.charAt(l2-i)-'0'+0)-(s1.charAt(l1-i)-'0'+0);
						if(temp<0){
							result[10000-i]=10+temp;
							result[9999-i]--;
						}
						else{
							result[10000-i]=temp;
						}
					}
					for(i=min+1;i<=max;i++){
						result[10000-i]=result[10000-i]+(s2.charAt(l1-i)-'0'+0);
					}
				}
				
				
				for(i=0;i<10000;i++){
					if(result[i]!=0){
						break;
					}
				}
				if(i==10000){
					System.out.println(0);
				}
				else{
					if(count==1){
						System.out.print("-");
					}
					for(;i<10000;i++){
						System.out.print(result[i]);
					}
					System.out.print("\n");		
				}

			}
		}
	}
}
