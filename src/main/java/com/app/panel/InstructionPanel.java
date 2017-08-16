package com.app.panel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InstructionPanel
{
	public Component Image() 
	{
		JPanel j=new JPanel();
		j.setSize(80,150);
		j.setBackground(Color.WHITE);
		j.setLocation(880,100);
		j.setPreferredSize(new Dimension(70,50));
		
		ImageIcon pic=new ImageIcon("");
		j.add(new JLabel(pic));
		
		return j;
	}
	
	public Component Label() 
	{
		JPanel panel=new JPanel();
		panel.setSize(300,40);
		panel.setLocation(500,200 );
		panel.setBackground(Color.WHITE);
		return panel;	
	}
}
