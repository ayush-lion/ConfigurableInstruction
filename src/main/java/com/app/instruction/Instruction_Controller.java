package com.app.instruction;

import java.util.ArrayList;

public class Instruction_Controller {
	
	
	Instruction_Performer performer ;
	InstructionCallPanel panel;
	ArrayList<Provider> Instruction_Pojo = new ArrayList<Provider>();
	
	public Instruction_Controller(InstructionCallPanel panel, ArrayList<Provider> data)
	{
		this.panel = panel;
		this.Instruction_Pojo = data;
	}
	
	public void Start_Intructing()
	{
		for(int i=0;i<Instruction_Pojo.size();i++)
		{
			if(Instruction_Pojo.get(i).getProvider_Allotee().equals(""))
			{
				
			}
		}
		
	}
	
	
	
	
	

}
