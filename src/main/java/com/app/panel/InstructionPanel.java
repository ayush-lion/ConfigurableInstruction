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
		j.setSize(50,50);
		j.setBackground(Color.WHITE);
		j.setLocation(950,300);
		j.setPreferredSize(new Dimension(70,50));
		
		ImageIcon pic=new ImageIcon("");
		j.add(new JLabel(pic));
		return j;
	}
}
