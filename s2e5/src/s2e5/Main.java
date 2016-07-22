package s2e5;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame{
	JButton ok,cancel,exit;
	JTextArea text;
	public Main(){
		setLayout(null);
		setSize(400,330);
		ok=new JButton("OK");
		cancel=new JButton("Cancel");
		exit=new JButton("Exit");
		text=new JTextArea();
		text.setBounds(5, 5, 390, 255);
		ok.setBounds(5, 270, 90, 25);
		cancel.setBounds(100, 270, 90, 25);
		exit.setBounds(195, 270, 90, 25);		
		ok.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(ok.getText());
			}			
		});
		cancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(cancel.getText());
			}			
		});		
		exit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}			
		});
		add(ok);
		add(cancel);
		add(exit);
		add(text);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
}
