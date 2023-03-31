/*package com.example.HL7.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

@Value("${file.upload-dir}")
String FILE_DIRECTORY;
public class HL7MessageService
{

	public ResponseEntity<Object> fileUpload(MultipartFile file) throws IOException
	{
	ArrayList<String> list=new ArrayList<String>();
	}
	ArrayList<String> list1=new ArrayList<String>();
	ArrayList<String> list2=new ArrayList<String>();
	LinkedHashMap<String,String> ls=new LinkedHashMap<String,String>();
	String table="";
	String arr1[];
	String arr4[]=new String[9];
	String sum="";
	String sum1="";
	int val;
		char c;
		String s = "";
		File myfile=new File(FILE_DIRECTORY+file.getOriginalFilename() );
		myfile.createNewFile();	
		FileOutputStream fos=new FileOutputStream(myfile);
		fos.write(file.getBytes());
		fos.close();
		try 
{
		FileInputStream fis=new FileInputStream(myfile);

	while((val=fis.read())!=-1) {
		c=(char)val; 
		s=String.valueOf(c); 
		sum=sum+s;
		}
	fis.close();
	String arr[]=sum.split("\\^");
	for(int i=0;i<arr.length;i++) { list.add(arr[i]); 
	}    
	}
  }    
 	catch(IOException e){
	e.printStackTrace();
        } */