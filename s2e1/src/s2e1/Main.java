package s2e1;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import java.util.Random;
public class Main extends Applet{
	private Button b1=new Button("Change");;
	private Random random=new Random();
	public void init(){
		this.setLayout(new FlowLayout());
		b1.setSize(50, 10);;
		this.add(b1);
		b1.addActionListener(new ActionListen(this));
	}
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}	
	public void action(){
		repaint();
	}
}
class ActionListen implements java.awt.event.ActionListener{
    Main mn;
    public ActionListen(Main m){
    	this.mn=m;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mn.action();
	}
	
}