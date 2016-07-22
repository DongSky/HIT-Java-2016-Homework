package s1e3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] queue=new int[101];
		int left=101;
		int count=1;
		//init
		for(int i=0;i<101;i++){
			if(i%2==0){
				queue[i]=1;
			}
			else{
				queue[i]=2;
			}
		}
		
		while(left>1){
			count=1;
			int temp=0;
			for(int i=0;i<101;i++){
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
			for(int i=0;i<101;i++){
				if(queue[i]==1){
					queue[i]=0;
				}
				else if(queue[i]==2){
					temp++;
				}
			}
			left=temp;
		}
		for(int i=0;i<101;i++){
			if(queue[i]!=0){
				System.out.println(i+1);
			}
		}
		
	}

}
