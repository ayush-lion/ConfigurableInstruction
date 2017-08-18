package com.app.instruction;

import java.awt.Graphics;
import java.awt.Image;

public class Instructions {
	
	
	//class for instruction structure
	
	private String ins_text;
	private String ins_shape;
	private Image image;
	private  int posX;
	private int posY;
	

	
	
	public Instructions(String text, String shape) {
		super();
		this.ins_text = text;
		this.ins_shape = shape;
	}
	
	
	public Instructions()
	{
		//default constructor
		
	}
	
	
	public void draw_instruction(Graphics g)
	{
		Graphics img = image.getGraphics();
		img.drawString(ins_text, 10, 10);
		img.dra
		
	}
	
	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	public String getIns_shape() {
		return ins_shape;
	}
	
	public String getIns_text() {
		return ins_text;
	}
	
	public void setIns_shape(String ins_shape) {
		this.ins_shape = ins_shape;
	}
	
	public void setIns_text(String ins_text) {
		this.ins_text = ins_text;
	}
	
	
	
	
	
	
	

}
