package com.pratice.Interface;

import java.util.ArrayList;

public abstract class Teaching_Dept implements School{

	
	public abstract void ofc_staff();
	
	public abstract void teach_staff();

	
	public abstract void cleaning_staff();

	
	public abstract void security();

	
	public abstract void management();

	
	public void students() {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("sudheer");
		names.add("suresh");
		names.add("vamsi");
		names.add("prasana");
		names.add("sai");
		
		for (int i=0; i<names.size();i++){
			System.out.println("the students names are "+ i);
			
			}
		
		
		
	}

	

}
