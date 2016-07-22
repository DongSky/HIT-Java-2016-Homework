package s2e2;

import java.io.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Main {
	static String[] path1;
	static int cursor=0;
	static int total=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Test");
		JLabel ImageLabel=new JLabel();
		TextField path=new TextField();
		JButton search=new JButton("搜索");
		JButton previous=new JButton("上一张");
		JButton next=new JButton("下一张");
		
		
			EventQueue.invokeLater(new  Runnable(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					frame.setSize(800, 850);
					frame.setLayout(null);
					ImageLabel.setSize(800, 600);
					//ImageLabel.setLocation(0, 0);
					ImageLabel.setBackground(Color.BLACK);
					//ImageLabel.setBounds(0, 0, 800, 600);
					path.setSize(600,20);
					path.setLocation(0,605);
					search.setSize(50, 20);
					search.setLocation(0,665);
					search.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							getFiles(path.getText().toString());
							cursor=0;
							ImageLabel.setIcon(new ImageIcon(path1[cursor]));
						}

					});
					previous.setSize(50, 20);
					previous.setLocation(0,725);
					previous.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(total==0){

							}
							else{
								cursor--;
								if(cursor==-1){
									cursor=total-1;
								}
								ImageLabel.setIcon(new ImageIcon(path1[cursor]));
							}
						}

					});
					next.setSize(50, 20);
					next.setLocation(0,780);
					next.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(total==0){

							}
							else{
								cursor++;
								if(cursor==total){
									cursor=0;
								}
								ImageLabel.setIcon(new ImageIcon(path1[cursor]));
							}
						}

					});
					frame.add(ImageLabel);
					frame.add(path);
					frame.add(search);
					frame.add(previous);
					frame.add(next);
					//frame.pack();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);		
					
					}
				
			});
	}
	
	public static void getFiles(String path){
		int i=0;
		File file = new File(path);
		File[] files=file.listFiles();

		for(File f : files){
			if(f.getAbsolutePath().contains(".jpg")||f.getAbsolutePath().contains(".png")){
				i++;
			}	
		}
		total=i;
		path1=new String[i];
		i=0;
		for(File f : files){
			if(f.getAbsolutePath().contains(".jpg")||f.getAbsolutePath().contains(".png")){
				String name =new String();
				name=f.getPath();
				path1[i]=name;
				name=f.getName();
				i++;
			}
		}
		for(i=0;i<path1.length;i++){
			System.out.println(path1[i]);
		}
	}
}

/*then i'll revise how to scan all pics
 * getfiles(path){
 * File file=new file(path);
 * File[] files=file.listFiles();
 * int i=0;
 * for(file f:files){
 * if(********){
 * i++}}
 * total=i;
 * path1=new String[i];
 * i=0;
 * for(File f:files){
 * if(********){
 * path[i++]=f.getAbsolutePath().toString();
 * }
 * then complete*/
