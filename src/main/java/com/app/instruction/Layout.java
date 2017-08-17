package com.app.instruction;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.app.panel.InstructionPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Window.Type;

public class Layout extends JFrame {
	public Layout() 
	{
		getContentPane().setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setResizable(false);
		setType(Type.UTILITY);
		getContentPane().setEnabled(false);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		getContentPane().add(panel, BorderLayout.CENTER);	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(22, 87, 96, 169);
		
		
		/**Add Gif in left hand side*/
		
		ImageIcon pic=new ImageIcon("C:\\Users\\dell\\Downloads\\Untitled-1.gif");
		panel_1.add(new JLabel(pic));
		getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(516, 45, 241, 211);
		
		/** Add Gif in right hand side*/
		
		ImageIcon pic2=new ImageIcon("C:\\Users\\dell\\Downloads\\images (1).jpg");
		panel_2.add(new JLabel(pic2));
		getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(128, 0, 273, 234);
		
		/** Add TextImage in middle of both*/
		
		ImageIcon pic3=new ImageIcon("C:\\Users\\dell\\Downloads\\4.png");
		panel_3.add(new JLabel(pic3));
		getContentPane().add(panel_3);
		
		this.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow));

		this.setSize(793, 305);
		this.setLocation(300, 300);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Layout();
	}
}
