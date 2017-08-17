package com.app.instruction;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InstructionLayout extends JFrame {
		
	public InstructionLayout() throws IOException {
		getContentPane().setEnabled(false);
		getContentPane().setForeground(Color.YELLOW);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setType(Type.UTILITY);
			
		getContentPane().setLayout(null);
		this.setResizable(false);
		this.setBounds(100, 100, 802, 302);
		
		JPanel j=new JPanel();
		j.setSize(90,150);
		j.setBackground(Color.WHITE);
		j.setLocation(677,86);
		
		this.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow));
		getContentPane().add(j);
		
		JLabel label = new JLabel();
		label.setBounds(569, 222, 46, 14);
		getContentPane().add(label);
		ImageIcon pic2=new ImageIcon("");
		j.add(new JLabel(pic2));
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(821, 107, 10, 53);
		ImageIcon pic=new ImageIcon("C:\\Users\\dell\\Downloads\\Untitled-1.gif");
		panel_1.add(new JLabel(pic));
		getContentPane().add(panel_1);
		panel_1.setBackground(Color.WHITE);
		
     
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(34, 86, 99, 150);
		ImageIcon pic21=new ImageIcon("C:\\Users\\dell\\Downloads\\Untitled-1.gif");
		panel_2.setBackground(Color.WHITE);
		panel_2.add(new JLabel(pic21));
		
		getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(146, 24, 258, 53);
		getContentPane().add(panel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(414, 24, 243, 53);
		getContentPane().add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setVisible(true);
		
	}
	/** method to show image in jpanel*/
	
	public Component Image() 
	{
		JPanel j=new JPanel();
		j.setSize(80,150);
		j.setBackground(Color.WHITE);
		j.setLocation(880,100);
		j.setPreferredSize(new Dimension(70,50));
		
		ImageIcon pic=new ImageIcon("C:\\Users\\dell\\Downloads\\images (1).jpg");
		j.add(new JLabel(pic));
		
		return j;
	}
	
	
	public static void main(String[] args) throws IOException {
		new InstructionLayout();
	}
}

