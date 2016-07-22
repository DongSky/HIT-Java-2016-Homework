package s2e7;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame{

	JTextArea textarea;
	JLabel stat;
	JButton bt;
	int numchar=0,numline=0,numword=0;
	public Main(){
		setLayout(null);
		setSize(400,600);
		textarea=new JTextArea();
		bt=new JButton("统计");
		stat=new JLabel("行数："+numline+"单词数："+numword+"字符数："+numchar);
		textarea.setBounds(5, 5, 390, 290);
		//textarea.setWrapStyleWord(true);
		//textarea.setLineWrap(true);
		bt.setBounds(25, 410, 100, 50);
		stat.setBounds(170,300,230,200);
		bt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(textarea.getText().toString());
				String s=textarea.getText().toString();
				numline=textarea.getLineCount();
				numchar=s.length()-numline+1;
				int w=0;
				numword=numline-1;
				for(int i=0;i<s.length();i++){
					if(s.charAt(i)==' '){
						w=0;
					}
					else if(w==0){
						w=1;
						numword++;
					}
				}
				stat.setText("行数："+numline+"单词数："+numword+"字符数："+numchar);
			}
			
		});
		add(bt);
		add(stat);
		add(textarea);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
