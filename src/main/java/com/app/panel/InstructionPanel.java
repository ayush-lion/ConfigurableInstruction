package com.app.panel;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class InstructionPanel extends JPanel {

	private String InstructionFrameImgPath = "D:/Official/WorkSpace/ConfigurableInstruction/src/main/resources/wodden-frame.jpg";
	BufferedImage InstructionFrame = null;
	
	public InstructionPanel() throws IOException 
	{
		InstructionFrame = ImageIO.read(this.getClass().getResourceAsStream(InstructionFrameImgPath));
		this.setLayout(null);
	}
}
