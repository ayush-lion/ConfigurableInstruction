package com.app.instruction;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.app.panel.InstructionPanel;

public class InstructionLayout extends JFrame {
	
	JTextField insSheet;
	JButton fileButton;
	JButton startButton;
	JButton killButton;
	ImagePanel main;
	
	InstructionPanel panel;
	
	public InstructionLayout() throws IOException {
			
		this.setLayout(null);
		this.setResizable(false);
		this.setTitle("Abacus. Lets start learning mind math !!!");
		this.setBounds(100, 100, 1050, 700);
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/** Setting up text field to display instruction file path */
		
		insSheet = new JTextField();
		insSheet.setText("Click load intruction sheet button to the instruction file");
		insSheet.setEnabled(false);
		insSheet.setBounds(10, 10, 600, 40);

		/** Setting up button to load instruction file */
		
		fileButton = new JButton("Load Instruction Sheet");
		fileButton.setBounds(610, 10, 215, 40);

		
		/** Setting up button to start demonstration */
		
		startButton = new JButton("Start Demo");
		startButton.setBounds(825, 10, 120, 40);
		startButton.setEnabled(false);
		
		
		/** Setting up the button and action to kill the current Demo */
		
		killButton = new JButton("Kill Demo");
		killButton.setBounds(945, 10, 90, 40);
		killButton.setEnabled(false);
		
		
		/** Setting up instruction panel */
		/*
		InstructionPanel panel=new InstructionPanel();
		panel.setBounds(10, 150, 1025, 670);*/
		
		/** Setting up Image panel */
		
		ImagePanel imagePanel = new ImagePanel();
        this.getContentPane().add(imagePanel, BorderLayout.CENTER);

		this.add(insSheet);
		this.add(fileButton);
		this.add(startButton);
		this.add(killButton);
		
		this.setVisible(true);
		
	}
	public static void main(String[] args) throws IOException {
		InstructionLayout instruction=new InstructionLayout();
	}
}
