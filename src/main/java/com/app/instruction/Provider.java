package com.app.instruction;

import java.awt.Image;

public class Provider {

	//class for configuring drawing and performing instruction callous.
	
	
	String Provider_Allotee;
	String Provider_Image;
	String[] Provider_Text;
	String Provider_Shape;
	int Provider_Max_Lines;
	
	public Provider()
	{
		
	}
	
	public void setProvider_Allotee(String provider_Allotee) {
		this.Provider_Allotee = provider_Allotee;
	}
	
	public void setProvider_Image(String provider_Image) {
		this.Provider_Image = provider_Image;
	}

	
	public void setProvider_Shape(String provider_Shape) {
		this.Provider_Shape = provider_Shape;
	}
	
	public void setProvider_Text(String[] provider_Text) {
		this.Provider_Text = provider_Text;
	}
	
	public String getProvider_Allotee() {
		return this.Provider_Allotee;
	}
	
	public String getProvider_Image() {
		return this.Provider_Image;
	}
	
	public int getProvider_Max_Lines() {
		return Provider_Max_Lines;
	}

	public void setProvider_Max_Lines(int provider_Max_Lines) {
		Provider_Max_Lines = provider_Max_Lines;
	}

	public String getProvider_Shape() {
		return this.Provider_Shape;
	}
	
	public String[] getProvider_Text() {
		return this.Provider_Text;
	}	
}
