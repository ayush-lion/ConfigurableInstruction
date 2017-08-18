package com.app.instruction;

import java.util.ArrayList;

public class Instruction_Controller {
	
	
	Instruction_Performer performer ;
	InstructionPanel panel;
	ArrayList<Provider> Instruction_Pojo = new ArrayList<Provider>();
	
	public Instruction_Controller(InstructionPanel panel, ArrayList<Provider> data)
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
	
	public void Draw_Actor_Tutor(Provider provider)
	{
		
	}
	
	public void Draw_Actor_Student(Provider provider)
	{
		
	}
	
	public void Instruct_Particular(Provider proivder)
	{
		
	}
	
	public void Instruct_Particular_Index(int index)
	{
		
	}
	
	
	
	
	
	
	
	

}
