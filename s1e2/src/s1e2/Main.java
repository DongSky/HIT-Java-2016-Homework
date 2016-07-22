package s1e2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left=30;
		int cur=0;
		int count=0;
		int[] queue=new int[30];
		for(int i=0;i<30;i++){
			queue[i]=i+1;
		}
		while(left>15){
			if(cur+1<9){
				if(queue[count]>0){
					cur++;
				}
				count++;
				if(count==30){
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
				if(count==30){
					count=0;
				}
			}
		}
		for(int i=0;i<30;i++){
			if(queue[i]!=0){
				System.out.println(queue[i]);
			}
		}
	}

}
