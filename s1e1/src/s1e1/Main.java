package s1e1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		x=(int)(n/0.48);
		//System.out.println(x);
		System.out.println(cal(x,x));
	}
	
	private static int cal(int empty,int t){
		int total=t;
		if(empty>=20){
			total+=(empty/20)*7;
			empty=empty%20+(empty/20)*7;
			//System.out.println(total);
		}
		if(empty<20&&empty>=3){
			total+=empty/3;
			empty=empty%3+empty/3;
			//System.out.println(total);
		}
		if(empty<3){
			return total;
		}
		else{
			return cal(empty,total);
		}
	}
	
}
