package lesson0;

import java.io.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Image;
import java.awt.Toolkit;

public class Main {
	
	public static void main(String[] args){
		 Frame f=new Frame();
		  JPanel Gim=null;
		  JLabel label=new JLabel();
		 JButton btn1=new JButton("Button1");
		JButton btn2=new JButton("Button2");		
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run() {
				Toolkit tk=Toolkit.getDefaultToolkit();
				Image im=new ImageIcon("/Users/Dongsky/Desktop/psb.jpg").getImage();
				ImageIcon icon=new ImageIcon("/Users/DongSky/psb(1).jpeg");
				// TODO Auto-generated method stub
				f.getContentPane().setLayout(null);
				f.setTitle("我不是拉拉人");
				f.setIconImage(im);
				label.setBounds(0, 0, 800, 600);
				label.setIcon(icon);
				btn1.setSize(50, 50);
				btn1.setBackground(Color.CYAN);
				btn1.setLocation(50, 50);
				f.add(label);
				f.add(btn1);
				f.getContentPane().setComponentZOrder(label,1);
				f.getContentPane().setComponentZOrder(btn1,0);
				//add(btn2);				
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setVisible(true);		
				System.out.println("妮可妮可妮");
			}			
		});		
	}
}
class Frame extends JFrame{	
	public Frame(){
		setSize(800,600);
		setResizable(true);
		setLocation(0,200);		
	}
}
class DComponent extends JComponent{
	
}