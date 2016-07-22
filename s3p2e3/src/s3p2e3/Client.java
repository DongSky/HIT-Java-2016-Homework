package s3p2e3;

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;
import java.io.*;

public class Client {
	public static Socket client;
	static DataInputStream in=null;
	static DataOutputStream out=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		try {
			client=new Socket("127.0.0.1",8888);
			in=new DataInputStream(client.getInputStream());
			out=new DataOutputStream(client.getOutputStream());
				for(int i=0;i<100;i++){
					int num=ran.nextInt(1000);
					out.writeInt(num);
					num=in.readInt();
					System.out.println("reply:"+num);
					out.writeInt(num);
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
