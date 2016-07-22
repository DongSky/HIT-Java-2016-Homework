package s2e3;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
	JFrame f=new JFrame("Test");
	JButton bt=new JButton("Translate");
	TextField num=new TextField();
	JLabel letter;
	Font font=new Font("黑体",Font.PLAIN,40);
	public Main(){
		letter=new JLabel("null");
		f.setSize(150,150);
		f.setLayout(null);
		bt.setSize(50,20);
		num.setSize(50,20);
		letter.setSize(120,60);
		num.setLocation(10,10);
		bt.setLocation(70,10);
		letter.setLocation(10,60);
		letter.setFont(font);
		
		bt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(letter.getText().toString());
				String s=num.getText().toString();
				System.out.println(s);
				if(s.equals("0")){
					letter.setText("zero");
				}
				else if(s.equals("1")){
					letter.setText("one");
				}
				else if(s.equals("2")){
					letter.setText("two");
				}
				else if(s.equals("3")){
					letter.setText("three");
				}
				else if(s.equals("4")){
					letter.setText("four");
				}
				else if(s.equals("5")){
					letter.setText("five");
				}
				else if(s.equals("6")){
					letter.setText("six");
				}
				else if(s.equals("7")){
					letter.setText("seven");
				}
				else if(s.equals("8")){
					letter.setText("eight");
				}
				else if(s.equals("9")){
					letter.setText("nine");
				}
			}
		});
		f.add(bt);
		f.add(letter);
		f.add(num);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();
	}
	public void changetext(String s){
		
	}
	
}
