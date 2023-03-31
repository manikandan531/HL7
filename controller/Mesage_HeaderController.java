//package com.example.HL7.controller;
//
//import java.io.IOException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.example.HL7.entity.MessageHeader;
//import com.example.HL7.service.FileReader;
//import com.example.HL7.service.MessageHeaderService;
//
//@RestController
//public class Mesage_HeaderController 
//{
//	
//	@Autowired
//	private MessageHeaderService messageHeaderService;
//	
//	@Autowired
//	private FileReader fileReader;
//	
//	@PostMapping("/api/hl7/messageheader")
//	public ResponseEntity<Object> fileUpload(@RequestParam("file") MultipartFile file) throws IOException
//	{
//		return fileReader.fileUpload(file);
//
//	}
//	
//	@GetMapping("/showMessageHeaderById/{id}")
//	public MessageHeader showMessageHeaderById(@PathVariable ("id") Integer id) 
//	{
//		return messageHeaderService.showMessageHeaderById(id); 
//	}
//	
//	
//	
//}
