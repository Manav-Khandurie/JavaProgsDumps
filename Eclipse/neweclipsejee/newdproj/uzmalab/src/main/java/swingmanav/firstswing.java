package swingmanav;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
@SuppressWarnings("unused")
public class firstswing {
	public static void main(String args[])
	{
		JFrame jf=new JFrame();
		JButton jb=new JButton(new ImageIcon("C:\\Users\\Manav Khandurie\\Downloads\\download (11).png"));
		//using image as an icon with a specified path
		jb.setBounds(100,100,200,200);
		//x,y,breath,height
		ActionListener al=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				System.out.println("Done");
			}
			
		};
		jb.addActionListener(al);
		jf.add(jb);
		jf.setSize(400, 400);
		//size of window
		jf.setLayout(null);
		jf.setVisible(true);
		//by default visible is set to false 
	}
}
