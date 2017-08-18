package com.app.instruction;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class PojoCreater {

		int counter;
		ArrayList<String> aList = new ArrayList<String>();
		ArrayList<Provider> list = new ArrayList<>();
		
		
		public ArrayList<Provider> getList() {
			return list;
		}

		public void setList(ArrayList<Provider> list) {
			this.list = list;
		}

		List<String> Alloter = new ArrayList<String>();
		
		public PojoCreater() {
			
			this.aList.add("<Tutor_t>and end</Tutor_t><Tutor_t>and end</Tutor_t>");
			this.aList.add("<Tutor_t>and end</Tutor_t>");
			this.aList.add("<STD_T>and end<STD_T>");
		}
		
		public void create() 
		{
			ArrayList<Provider> lists = new ArrayList<Provider>();
			
			final Pattern pattern = Pattern.compile("<Tutor_t>(.+?)</Tutor_t>");
				Pattern student_pattern = Pattern.compile("<STD_T>(.+?)</STD_T>");
			Matcher matcher_tutor;
			Matcher matcher_student;
			for(int i=0; i<aList.size();i++)
			{
				System.out.println(""+aList.get(i));
				Provider provider = new Provider();
			matcher_tutor = pattern.matcher(""+aList.get(i));
			matcher_student = student_pattern.matcher(""+aList.get(i));
			if(matcher_tutor.find())
			{
				System.out.println(""+matcher_tutor.group(1));
				provider.setProvider_Allotee("TUTOR");
				provider.setProvider_Text(matcher_tutor.group(1));
				provider.setProvider_Shape("CLOUD");
				
				
			}
			else
			if(matcher_student.find())
			{
				System.out.println(""+matcher_student.group(1));

				System.out.println(""+matcher_student.group(1));
				provider.setProvider_Allotee("TUTOR");
				provider.setProvider_Text(matcher_student.group(1));
				provider.setProvider_Shape("CLOUD");
			
			}
				lists.add(provider);
			
			}
			
			setList(lists);
			
		
		}	
		
		public void show() 
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
			
			for(int i =0;i<obj.list.size();i++)
			{
				System.out.println(obj.list.get(i).Provider_Allotee+""+obj.list.get(i).Provider_Shape);	
			}
			
			
		}
	}

