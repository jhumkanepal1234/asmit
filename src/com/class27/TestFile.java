package com.class27;

public class TestFile {

	public static void main(String[] args) {
		File obj=new JavaFile();
		obj.close();
		obj.edit();
		obj.open();
		
		File obj1=new WordFile();
		obj1.close();
		obj1.edit();
		obj1.open();
		
		File obj2=new PDFFile();
		obj2.close();
		obj2.edit();
		obj2.open();
		

	}

}
