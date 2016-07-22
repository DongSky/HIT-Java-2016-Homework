package s1e8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int left=n;
		int cur=0;
		int count=0;
		int[] queue=new int[n];
		for(int i=0;i<n;i++){
			queue[i]=i+1;
		}
		while(left>1){
			if(cur+1<3){
				if(queue[count]>0){
					cur++;
				}
				count++;
				if(count==n){
					count=0;
				}
			}
			else{
				if(queue[count]>0){
					//System.out.println(queue[count]);
					queue[count]=0;
					left--;
					cur=0;
				}		
				count++;
				if(count==n){
					count=0;
				}
			}
		}
		for(int i=0;i<n;i++){
			if(queue[i]!=0){
				System.out.println(queue[i]);
			}
		}
	}

}
