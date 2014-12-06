package com.app.util;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Areas {
	
	public static Areas area = null;
	public static ArrayList areaString;
	public static ArrayList codeString;
	
	public static Areas getInstance()throws Exception{
		if(area == null){
			area = new Areas();
		}
		return area;
	}
	
	private Areas() throws FileNotFoundException, IOException{
		load();
	}
	
	private void load() throws FileNotFoundException, IOException{
		areaString = new ArrayList();
		codeString = new ArrayList();
		File directory = new File (".");
	
	//	FileReader fr = new FileReader("../WebContent/WEB-INF/Areas.txt"); 
		InputStream fis = getClass().getResourceAsStream("Areas.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis)); 
		String s; 
		while((s = br.readLine()) != null) { 
			areaString.add(s.substring(0, s.indexOf("-")-1)); 
		} 
		fis = getClass().getResourceAsStream("Areas.txt");
		br = new BufferedReader(new InputStreamReader(fis)); 
		
		while((s = br.readLine()) != null) { 
			codeString.add(s.substring(s.lastIndexOf("-")+2)); 
			} 
		 	fis.close(); 
	} 
	
	public String getArea(){
		
		String areaHTML="";
		for(int i =0;i<areaString.size();i++)
			areaHTML += "<option value='"+codeString.get(i)+"'>"+areaString.get(i)+"</pption>";
		return areaHTML;
	}
	
}
	
	
	

