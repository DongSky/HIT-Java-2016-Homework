package s3p1e3;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public class poly{
		int n;
		int a;
	}
	public ArrayList<poly> p1=new ArrayList();
	public ArrayList<poly> p2=new ArrayList();
	public ArrayList<poly> sum=new ArrayList();
	
	public ArrayList<poly> input(String str){
		ArrayList<poly> p=new ArrayList();
		poly tmp=new poly();
		int len=str.length();
		char x;
		int i=0;
		String sa=new String();
		while(i<len){
			tmp=new poly();
			x=str.charAt(i);
			sa=new String();
			if(x=='-'){
				i++;
				x=str.charAt(i);
				while(x<='9'&&x>='0'){
					sa+=x;
					i++;
					x=str.charAt(i);
				}
				tmp.a=0-Integer.parseInt(sa);
				i++;
				x=str.charAt(i);
				tmp.n=x-48;
				p.add(tmp);
				i++;
			}
			else if(x<='9'&&x>'0'){
				sa=new String();
				x=str.charAt(i);
				while(x<='9'&&x>='0'){
					sa+=x;
					i++;
					x=str.charAt(i);
				}
				tmp.a=Integer.parseInt(sa);
				i++;
				x=str.charAt(i);
				tmp.n=x-48;
				p.add(tmp);
				i++;
			}
			else if(x=='+'){
				sa=new String();
				i++;
				x=str.charAt(i);
				while(x<='9'&&x>='0'){
					sa+=x;
					i++;
					x=str.charAt(i);
				}
				tmp.a=Integer.parseInt(sa);
				i++;
				x=str.charAt(i);
				tmp.n=x-48;
				p.add(tmp);
				i++;
			}
		}
		return p;
	}
	public void excution(){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		p1=input(str);
		str=new String();
		str=s.next();
		p2=input(str);
		int len1=p1.size();
		int len2=p2.size();
		int i=0,j=0;
		poly tmp1=new poly();
		poly tmp2=new poly();
		poly tmp=new poly();
		while(i<len1&&j<len2){
			tmp1=p1.get(i);
			tmp2=p2.get(j);
			tmp=new poly();
			if(tmp1.n==tmp2.n){
				int a=tmp1.a+tmp2.a;
				if(a==0){
					i++;
					j++;
				}
				else{
					i++;
					j++;
					tmp.a=a;
					tmp.n=tmp1.n;
					sum.add(tmp);
				}
			}
			else if(tmp1.n>tmp2.n){
				sum.add(tmp1);
				i++;
			}
			else if(tmp2.n>tmp1.n){
				sum.add(tmp2);
				j++;
			}
		}
		if(i<len1){
			for(;i<len1;i++){
				sum.add(p1.get(i));
			}
		}
		if(j<len2){
			for(;j<len2;j++){
				sum.add(p2.get(j));
			}
		}
		for(int k=0;k<sum.size()-1;k++){
			System.out.print(sum.get(k).a+"x"+sum.get(k).n+"+");
		}
		System.out.println(sum.get(sum.size()-1).a+"x"+sum.get(sum.size()-1).n);
	}	
	public static void main(String args[]){	
		Main m=new Main();
		m.excution();
	}
}

