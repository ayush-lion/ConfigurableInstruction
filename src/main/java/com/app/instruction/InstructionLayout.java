package com.app.instruction;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InstructionLayout extends JFrame {
		
	public InstructionLayout() throws IOException {
		getContentPane().setEnabled(false);
		getContentPane().setForeground(Color.YELLOW);
		getContentPane().setBackground(Color.WHITE);
		setType(Type.UTILITY);
			
		getContentPane().setLayout(null);
		this.setResizable(false);
		this.setBounds(100, 100, 802, 302);
		
		JPanel j=new JPanel();
		j.setSize(90,150);
		j.setBackground(Color.WHITE);
		j.setLocation(677,86);
		
		
		JPanel panel2=new JPanel();
		panel2.setSize(239,40);
		panel2.setLocation(145,41 );
		panel2.setBackground(Color.WHITE);
		getContentPane().add(panel2);
		
		this.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow));
		getContentPane().add(j);
		
		JLabel label = new JLabel("");
		label.setBounds(569, 222, 46, 14);
		getContentPane().add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(821, 107, 10, 53);
		getContentPane().add(panel_1);
		panel_1.setBackground(Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(33, 86, 90, 150);
		getContentPane().add(panel_2);
		panel_2.setBackground(Color.WHITE);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(417, 41, 239, 40);
		getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setVisible(true);
		
	}
	public static void main(String[] args) throws IOException {
		new InstructionLayout();
	}
}

