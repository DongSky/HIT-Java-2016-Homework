package s2e6;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,multi,div,point,equal;
	JTextField text;
	Font font=new Font("黑体",Font.PLAIN,40);
	double re1,re2,re3;
	int operation=0;
	public Main(){
		setLayout(null);
		setSize(400,600);
		b1=new JButton("1");
		b1.setSize(80,80);
		b2=new JButton("2");
		b2.setSize(80,80);
		b3=new JButton("3");
		b3.setSize(80,80);
		b4=new JButton("4");
		b4.setSize(80,80);
		b5=new JButton("5");
		b5.setSize(80,80);
		b6=new JButton("6");
		b6.setSize(80,80);
		b7=new JButton("7");
		b7.setSize(80,80);
		b8=new JButton("8");
		b8.setSize(80,80);
		b9=new JButton("9");
		b9.setSize(80,80);
		b0=new JButton("0");
		b0.setSize(80,80);
		add=new JButton("+");
		add.setSize(80,80);
		sub=new JButton("-");
		sub.setSize(80,80);
		multi=new JButton("×");
		multi.setSize(80,80);
		div=new JButton("÷");
		div.setSize(80,80);
		point=new JButton("∙");
		point.setSize(80,80);
		equal=new JButton("=");
		equal.setSize(80,80);
		text=new JTextField();
		text.setFont(font);
		text.setBounds(5, 5, 390, 80);
		b1.setLocation(5, 90);
		b2.setLocation(90,90);
		b3.setLocation(175, 90);
		add.setLocation(260,90);
		b4.setLocation(5, 175);
		b5.setLocation(90, 175);
		b6.setLocation(175, 175);
		sub.setLocation(260, 175);
		b7.setLocation(5,260);
		b8.setLocation(90, 260);
		b9.setLocation(175, 260);
		multi.setLocation(260,260);
		point.setLocation(5, 345);
		b0.setLocation(90, 345);
		equal.setLocation(175, 345);
		div.setLocation(260, 345);
		
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+"1");
			}
			
		});
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+"2");
			}
			
		});
		b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+"3");
			}
			
		});
		b4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+"4");
			}
			
		});
		b5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+"5");
			}
			
		});
		b6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+"6");
			}
			
		});
		b7.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+"7");
			}
			
		});
		b8.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+"8");
			}
			
		});
		b9.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+"9");
			}
			
		});
		b0.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+"0");
			}
			
		});
		point.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(text.getText()+".");
			}
			
		});
		equal.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				equalActivity(operation);
			}
			
		});
		add.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addActivity();
			}
			
		});
		sub.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				subActivity();
			}
			
		});
		multi.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				multiActivity();
			}
			
		});
		div.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				divActivity();
			}
			
		});
		add(text);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(add);
		add(sub);
		add(multi);
		add(div);
		add(point);
		add(equal);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	public void addActivity(){
		re1=Double.parseDouble(text.getText());
		equalActivity(operation);
		operation=1;
		text.setText("");
	}
	public void subActivity(){
		re1=Double.parseDouble(text.getText());
		equalActivity(operation);
		operation=2;
		text.setText("");
	}
	public void multiActivity(){
		re1=Double.parseDouble(text.getText());
		equalActivity(operation);
		operation=3;
		text.setText("");
	}
	public void divActivity(){
		re1=Double.parseDouble(text.getText());
		equalActivity(operation);
		operation=4;
		text.setText("");
	}
	public void equalActivity(int operation){
		re2=Double.parseDouble(text.getText());
		if(operation==1){
			re3=re1+re2;
			text.setText(re3+"");
			re1=re3;
		}
		else if(operation==2){
			re3=re1-re2;
			text.setText(re3+"");
			re1=re3;
		}
		else if(operation==3){
			re3=re1*re2;
			text.setText(re3+"");
			re1=re3;
		}
		else if(operation==4){
			if(re2!=0){
			re3=re1/re2;
			text.setText(re3+"");
			re1=re3;
			}
			else{
				text.setText("error");
			}
		}
		else if(operation==0){
			
		}
	}
}
