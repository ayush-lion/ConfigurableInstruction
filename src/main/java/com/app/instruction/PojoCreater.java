package com.app.instruction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PojoCreater {

	int counter;
	ArrayList<String> aList;
	
	List<String> Alloter = new ArrayList<String>();
	
	public PojoCreater() {
		
		aList=new ArrayList<String>();
		aList.add("<Tutor_s>and end</Tutor_s>");
		aList.add("<Tutor_t>and end</Tutor_t>");
		aList.add("<STD_T>and end<STD_T>");
	}
	
	public void create() 
	{
		ArrayList<Provider> list = new ArrayList<>();
		Iterator iterator = aList.iterator();
		
		while (iterator.hasNext())
		{
			int lines;
			String[] teacher = null;
			String[] Student = null;
			Provider pro = new Provider();
			String text=(String) iterator.next();
			
			if(text.trim().equalsIgnoreCase("<Tutor_s>"+teacher+"</Tutor_s>"))
				{
				pro.setProvider_Allotee("tutor");
				pro.setProvider_Max_Lines(teacher.length);
				pro.setProvider_Text(teacher);
				pro.setProvider_Shape("flat");
				}
			else if(text.trim().equalsIgnoreCase("<Tutor_t>"+teacher+"</Tutor_t>")) 
				{
				pro.setProvider_Allotee("tutor");
				pro.setProvider_Max_Lines(teacher.length);
				pro.setProvider_Text(teacher);
				pro.setProvider_Shape("cloud");
				}
			else if(text.trim().equalsIgnoreCase("<STD_S>"+Student+"</STD_S>")) 
				{
				pro.setProvider_Allotee("Student");
				pro.setProvider_Max_Lines(Student.length);
				pro.setProvider_Text(Student);
				pro.setProvider_Shape("flat");
				}
			else if(text.trim().equalsIgnoreCase("<STD_t>"+Student+"</STD_t>")) 
				{
				pro.setProvider_Allotee("Student");
				pro.setProvider_Text(Student);
				pro.setProvider_Max_Lines(Student.length);
				pro.setProvider_Shape("cloud");
				}
		}	
		
	}

	public void check() 
	{
		
	}
	
	public ArrayList<String> getaList() {
		return aList;
	}

	public void setaList(ArrayList<String> aList) {
		this.aList = aList;
	}
	
	public static void main(String[] args) {
		PojoCreater obj=new PojoCreater();
		obj.create();
	}
}
