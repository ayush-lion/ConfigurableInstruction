package com.app.instruction;

import java.awt.Graphics;
import java.awt.Image;

public class Actors {
	
	
	 private Image actor_path;
	 private int id;
	 private int posX;
	 private int posY;
	 private int width;
	 private int height;
	 private String actor_name;
	 private boolean is_actor_expressing;
	 private Image actor_expression_path;
	 
	 
	 public void drawActor(Graphics g) {
			
			if (isIs_actor_expressing()) {
				g.drawImage(actor_path, posX, posY, width, height, null);
			} else {
				g.drawImage(actor_path, posX, posY, width, height, null);
			}
		}
	 
	 public Image getActor_expression_path() {
		return actor_expression_path;
	}
	 
	 public String getActor_name() {
		return actor_name;
	}
	 
	 public int getId() {
		return id;
	}
	 
	 public void setActor_expression_path(Image actor_expression_path) {
		this.actor_expression_path = actor_expression_path;
	}
	 
	 public void setActor_name(String actor_name) {
		this.actor_name = actor_name;
	}
	 
	 public void setId(int id) {
		this.id = id;
	}
	 
	 
	 public void setIs_actor_expressing(boolean is_actor_expressing) {
		this.is_actor_expressing = is_actor_expressing;
	}
	 
	 public boolean isIs_actor_expressing() {
		return is_actor_expressing;
	}
	
	public Image getPath() {
		return actor_path;
	}
	
	public void setPath(Image path) {
	this.actor_path = path;
	}
	
	
	public Actors()
	{}

}
