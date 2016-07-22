package s1e6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] queue=new int[101];
		int left=n;
		int count=1;
		//init
		for(int i=0;i<n;i++){
			if(i%2==0){
				queue[i]=1;
			}
			else{
				queue[i]=2;
			}
		}
		
		b:while(left>2){
			count=1;
			int temp=0;
			for(int i=0;i<n;i++){
				if(queue[i]!=0){
					if(count==1){
						queue[i]=1;
						count=2;
					}
					else if(count==2){
						queue[i]=2;
						count=1;
					}
				}
			}
			for(int i=0;i<n;i++){
				if(queue[i]==1){
					queue[i]=0;
					left--;
					if(left==2){
						break b;
					}
				}
				else if(queue[i]==2){
					temp++;
				}
			}
		}
		for(int i=0;i<n;i++){
			if(queue[i]!=0){
				System.out.println(i+1);
			}
		}
		
	}

}