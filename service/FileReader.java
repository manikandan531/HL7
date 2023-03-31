package com.example.HL7.service;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.HL7.entity.Acknowledgement;
import com.example.HL7.entity.MessageHeader;
import com.example.HL7.entity.Receiver;
import com.example.HL7.entity.Sender;
import com.example.HL7.repository.AcknowledgementRepository;
import com.example.HL7.repository.MessageHeaderRepository;
import com.example.HL7.repository.ReceiverRepository;
import com.example.HL7.repository.SenderRepository;
@Service
public class FileReader {
	
	@Autowired(required=true)
	private MessageHeaderRepository messageRepo;
	
	@Autowired(required=true)
	private SenderRepository senderRepo;
	
	@Autowired
	private ReceiverRepository receiverRepo;
	
	@Autowired
	private AcknowledgementRepository acknowledgementRepo;

@Value("${file.upload-dir}")
String FILE_DIRECTORY;


public ResponseEntity<Object> fileUpload(MultipartFile file) throws IOException
{
	ArrayList<String> list=new ArrayList<String>();
	ArrayList<String> list1=new ArrayList<String>();
	ArrayList<String> list2=new ArrayList<String>();

	String table="";
	String arr1[];
	String sum="";
	String sum1="";
	int val;
		char c;
		String s = "";
	
	File myfile=new File(FILE_DIRECTORY+file.getOriginalFilename());
	myfile.createNewFile();

	FileOutputStream fos=new FileOutputStream(myfile);
	fos.write(file.getBytes());
	fos.close();
	try 
{
	FileInputStream fis=new FileInputStream(myfile);
	while((val=fis.read())!=-1) 
	{
		c=(char)val;
		s=String.valueOf(c);
		sum=sum+s;
	}
	
	fis.close();
	String arr[]=sum.split("\\^");
	for(int i=0;i<arr.length;i++) 
	{ 
		list.add(arr[i]); 
	}
	
}
	
	catch(IOException e)
	{
		
	e.printStackTrace();
	
	}

	
	//i+ "   " +
	
//	System.out.println(list.get(0));
//	System.out.println(list.get(1));
//	System.out.println(list.get(2));
//	System.out.println(list.get(3));
//	System.out.println(list.get(4));
//	System.out.println(list.get(5));
//	System.out.println(list.get(6));
//	System.out.println(list.get(7));
//	System.out.println(list.get(8));
	
	//String	str=(list.get(0));
	//int a=Integer.parseInt(str);
	
	//Map<String, String> messageValues = Parser.messageParser(fis.read());

	MessageHeader msgHeader = new MessageHeader();
	msgHeader.setId(1);
	msgHeader.setFieldSeparator(list.get(0));
	msgHeader.setEncodingCharacters(list.get(1));
	msgHeader.setMessageType(list.get(2));
	msgHeader.setTriggerEvent(list.get(3));
	msgHeader.setMessageControlId(list.get(4));
	msgHeader.setProcessingId(list.get(5));
	msgHeader.setVersionId(list.get(6));
	msgHeader.setDateTimeOfMessage(list.get(7));
	messageRepo.save(msgHeader);
//	
//	for(int i=0;i<17;i++)
//	{
//		System.out.println( i+ "   " + list.get(i));
//	}
//	

	Sender sender = new Sender();
	sender.setId(1);
	sender.setIdMessageHeader(list.get(0));
	sender.setSendingApplicationId(list.get(1));
	sender.setSendingFacilityId(list.get(2));
	sender.setUniversalId(list.get(3));
	sender.setUniversalIdType(list.get(4));
	senderRepo.save(sender);

	
	Receiver receiver = new Receiver();
	receiver.setId(1);
	receiver.setIdMessageHeader(list.get(0));
	receiver.setReceivingApplicationId(list.get(1));
	receiver.setReceivingFacilityId(list.get(2));
	receiver.setUniversalId(list.get(3));
	receiver.setUniversalIdType(list.get(4));
	receiverRepo.save(receiver);

	Acknowledgement acknowledgement = new Acknowledgement();
	acknowledgement.setId(1);
	acknowledgement.setMessageId(list.get(0));
	acknowledgement.setAcceptAcknowledgementType(list.get(1));
	acknowledgement.setApplicationAcknowledgementType(list.get(2));
	acknowledgement.setCountryCode(list.get(3));
	acknowledgementRepo.save(acknowledgement);
	
	
	return new ResponseEntity<Object>("file upload successfully"+msgHeader.getId(),HttpStatus.OK);

	}
}
