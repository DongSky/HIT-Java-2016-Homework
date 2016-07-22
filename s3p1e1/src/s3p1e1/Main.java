package s3p1e1;

public class Main {
	//this is a test sample
	public static int[] num={2,6,3,8,0,1,4,7,9,5};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		qsort(num,0,9);
		for(int i=0;i<10;i++){
			System.out.println(num[i]);
		}
	}
	public static void qsort(int[] num,int start,int end){
		int i,j,n;
		i=start;
		j=end;
		n=num[start];
		while(i<j){
			while(num[j]>n&&j>i){
				j--;
			}
			num[i]=num[j];
			while(num[i]<n&&i<j){
				i++;
			}
			num[j]=num[i];			
		}
		num[i]=n;
		if(i-1>start){
			qsort(num,start,i-1);
		}
		if(i+1<end){
			qsort(num,i+1,end);
		}
	}
}
