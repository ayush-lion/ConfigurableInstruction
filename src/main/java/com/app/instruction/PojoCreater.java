package com.app.instruction;

import java.util.ArrayList;
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

		this.aList.add("<Tutor_t>and hello end</Tutor_t><Tutor_t>and end</Tutor_t>");
		this.aList.add("<Tutor_t>and end</Tutor_t>");
		this.aList.add("<STD_T>and end<STD_T>");
		this.aList.add("<Tutor_s>hello speech tutor</Tutor_s>");
		this.aList.add("<STD_s>hello speech STD</STD_s>");
	}

	public void create() {
		ArrayList<Provider> lists = new ArrayList<Provider>();

		final Pattern pattern = Pattern.compile("<Tutor_t>(.+?)</Tutor_t>");
		final Pattern student_pattern = Pattern.compile("<STD_T>(.+?)</STD_T>");
		final Pattern tutor_speech_pattern = Pattern.compile("<Tutor_s>(.+?)</Tutor_s>");
		final Pattern student_speech_pattern = Pattern.compile("<STD_s>(.+?)</STD_s>");

		Matcher matcher_tutor;
		Matcher matcher_student;
		Matcher matcher_tutor_speech;
		Matcher matcher_std_speech;

		for (int i = 0; i < aList.size(); i++) {
			System.out.println("" + aList.get(i));
			Provider provider = new Provider();

			matcher_tutor = pattern.matcher("" + aList.get(i));
			matcher_student = student_pattern.matcher("" + aList.get(i));

			matcher_tutor_speech = tutor_speech_pattern.matcher("" + aList.get(i));
			matcher_std_speech = student_speech_pattern.matcher("" + aList.get(i));

			if (matcher_tutor.find()) {
				// System.out.println("" + matcher_tutor.group(1));
				provider.setProvider_Allotee("TUTOR");
				provider.setProvider_Text(matcher_tutor.group(1));
				provider.setProvider_Shape("CLOUD");
			} else

			if (matcher_student.find()) {
				//System.out.println("" + matcher_student.group(1));
				provider.setProvider_Allotee("TUTOR");
				provider.setProvider_Text(matcher_student.group(1));
				provider.setProvider_Shape("CLOUD");
			}

			else if (matcher_tutor_speech.find()) {
				//System.out.println("" + matcher_tutor_speech.group(1));
				provider.setProvider_Allotee("TUTOR");
				provider.setProvider_Shape("FLAT");
				provider.setProvider_Text(matcher_std_speech.group(1));

			}

			else if (matcher_std_speech.find()) {
				//System.out.println("" + matcher_std_speech.group(1));
				provider.setProvider_Allotee("STD");
				provider.setProvider_Shape("FLAT");
				provider.setProvider_Text(matcher_std_speech.group(1));
			}

			lists.add(provider);
		}
		setList(lists);
	}

	public ArrayList<String> getaList() {
		return aList;
	}

	public void setaList(ArrayList<String> aList) {
		this.aList = aList;
	}

	public static void main(String[] args) {
		PojoCreater obj = new PojoCreater();
		obj.create();
		for (int i = 0; i < obj.list.size(); i++) {
			// System.out.println(obj.list.get(i).Provider_Allotee+""+obj.list.get(i).Provider_Shape);
		}
	}
}
