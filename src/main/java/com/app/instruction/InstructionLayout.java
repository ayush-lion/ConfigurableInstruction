package com.app.instruction;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.app.panel.InstructionPanel;

public class InstructionLayout extends JFrame {
	
	InstructionPanel panel;
	
	public InstructionLayout() throws IOException {
			
		this.setLayout(null);
		this.setResizable(false);
		this.setBounds(100, 100, 1050, 400);
		
		JPanel j=new JPanel();
		j.setSize(50,50);
		j.setBackground(Color.WHITE);
		j.setLocation(50,300);
	
		
		panel=new InstructionPanel();
		panel.Image();
		this.add(panel.Image());
		this.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 1, 2, 1, Color.YELLOW));
		this.add(j);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setVisible(true);
		
	}
	public static void main(String[] args) throws IOException {
		new InstructionLayout();
	}
}

