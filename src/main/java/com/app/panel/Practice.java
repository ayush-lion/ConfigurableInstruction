package com.app.panel;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Practice extends JFrame {
 
	public static void main(String[] args) {
    new Practice();
  }

  public Practice() {
    this.setTitle("Picture Application");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel1 = new JPanel();
    ImageIcon pic = new ImageIcon("C:\\Users\\dell\\Downloads\\images (1).jpg");
    panel1.setPreferredSize(new Dimension(100,150));
    panel1.add(new JLabel(pic));
    this.add(panel1);
    this.pack();
    this.setSize(500,500);
    this.setVisible(true);
  }
}