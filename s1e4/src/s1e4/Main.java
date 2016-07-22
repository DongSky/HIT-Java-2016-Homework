package s1e4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sqn=(int)(Math.sqrt(n+0.0));
		//System.out.println(sqn);
		for(i=2;i<=sqn*sqn;i++){
			if((n-i*(i-1)/2)%i==0){
				k=(n-i*(i-1)/2)/i;
				if(k>0){
					for(j=0;j<i;j++){
						System.out.print(k+j+" ");
					}
					System.out.println("\n");
				}
			}
		}
	}

}
