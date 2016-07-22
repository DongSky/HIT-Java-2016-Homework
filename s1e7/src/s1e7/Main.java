package s1e7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String();
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		int l=str.length();
		int halfl=l/2;
		int flag=1;
		for(int i=0;i<halfl;i++){
			if(str.charAt(i)!=str.charAt(l-i-1)){
				flag=0;
			}
		}
		if(flag==0){
			System.out.println("False");
		}
		else{
			System.out.println("true");
		}
		}

}
