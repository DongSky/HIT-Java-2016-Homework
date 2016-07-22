package s3p1e5;
import java.io.*;
import java.util.Scanner;

public class Main {
	public static int[] number=new int[10000];
	public static void init(){
		
		number[0]=2;
		number[1]=2;
		number[2]=2;
		for(int i=3;i<10000;i++){
			number[i]=number[i-1]+number[i-3];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		init();
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println(number[n]);
	}
	
}
