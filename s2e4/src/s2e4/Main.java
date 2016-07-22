package s2e4;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame{
	JButton add,sub,multi,div;
	JLabel l1,l2,l3;
	TextField n1,n2,re;	
	public Main(){
		setSize(420,150);
		setLayout(null);
		add=new JButton("Add");
		sub=new JButton("Subtract");
		multi=new JButton("Multiply");
		div=new JButton("Divide");
		l1=new JLabel("Number 1");
		l2=new JLabel("Number 2");
		l3=new JLabel("Result");
		n1=new TextField();
		n2=new TextField();
		re=new TextField();
		l1.setBounds(5, 5, 70, 25);
		n1.setBounds(80, 5, 50, 25);
		l2.setBounds(135, 5, 70, 25);
		n2.setBounds(210, 5, 50, 25);
		l3.setBounds(275, 5, 60, 25);
		re.setSize(70, 25);
		re.setLocation(340, 5);
		add.setBounds(5, 60, 80, 25);
		sub.setBounds(90, 60, 80, 25);
		multi.setBounds(175,60,80,25);
		div.setBounds(260, 60, 80, 25);		
		add.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double num1=Double.parseDouble(n1.getText());
				double num2=Double.parseDouble(n2.getText());
				re.setText((num1+num2)+"");
			}
			
		});
		sub.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double num1=Double.parseDouble(n1.getText());
				double num2=Double.parseDouble(n2.getText());
				re.setText((num1-num2)+"");
			}
			
		});
		multi.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double num1=Double.parseDouble(n1.getText());
				double num2=Double.parseDouble(n2.getText());
				re.setText((num1*num2)+"");
			}
			
		});
		div.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double num1=Double.parseDouble(n1.getText());
				double num2=Double.parseDouble(n2.getText());
				re.setText((num1/num2)+"");
			}			
		});		
		add(l1);
		add(l2);
		add(l3);
		add(n1);
		add(n2);
		add(re);
		add(add);
		add(sub);
		add(multi);
		add(div);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
