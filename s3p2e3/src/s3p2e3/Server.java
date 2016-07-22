package s3p2e3;

import java.net.*;
import java.io.*;

public class Server {
	public static ServerSocket server;
	public static Socket socket;
	static DataInputStream in=null;
	static DataOutputStream out=null;
	static int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			server=new ServerSocket(8888);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			socket=server.accept();
			in=new DataInputStream(socket.getInputStream());
			out=new DataOutputStream(socket.getOutputStream());
			while(true){
				num=in.readInt();
				System.out.println("get:"+num);
				out.writeInt(num*2);
				num=in.readInt();
				System.out.println("The result is:"+num);
				
			}
		} catch (IOException e) {
			System.out.println("connect failed");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
