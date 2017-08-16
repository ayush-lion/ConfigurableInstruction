package com.app.instruction;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

class ImagePanel extends JPanel {

	  Image image;

	  public ImagePanel() {
	    image = Toolkit.getDefaultToolkit().createImage("C:/Users/dell/Downloads/expressive-businesswoman-character-collection_23-214760672536363636360025362536.gif");
	  }
	  
	  @Override
	  public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    if (image != null) {
	      g.drawImage(image, 0, 0, this);
	    }
	  }
}