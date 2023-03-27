package com.sach;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Product 
{
	public static void main(String[] args) 
	{
		
		try 
		{
		 List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\sachi\\OneDrive\\Desktop\\Pro - Copy.csv"));
		  for(String line : lines) 
		  {
			  line = line.replace("\""," ");
			  String []result = line.split(",");
			  for(String s : result)
				  System.out.println(s);
			  System.out.println();
		  }
		  
		}
		catch(Exception e)
		{
		   System.out.println(e.getMessage());
		}       
	}
}
