//package com.example.HL7.controller;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.example.HL7.entity.Acknowledgement;
//import com.example.HL7.entity.MessageHeader;
//import com.example.HL7.entity.Sender;
//import com.example.HL7.repository.MessageHeaderRepository;
//import com.example.HL7.repository.ReceiverRepository;
//import com.example.HL7.service.AcknowledgementService;
//import com.example.HL7.service.FileReader;
//import com.example.HL7.service.MessageHeaderService;
//import com.example.HL7.service.ReceiverService;
//import com.example.HL7.service.SenderService;
//@RestController
//public class AcknowledgementController 
//{
//	@Autowired
//	private AcknowledgementService acknowledgementService;
//	
//	@Autowired
//	private FileReader fileReader;
//	
//	//@Autowired FileReader file;
//
//	@PostMapping("/api/hl7/create")
//	public ResponseEntity<Object> fileUpload(@RequestParam("file") MultipartFile file) throws IOException
//	{
//		return fileReader.fileUpload(file);
//	}
//	
//	@GetMapping("/showAcknowledgementById/{id}")
//	public Acknowledgement showAcknowledgementrById(@PathVariable ("id") Integer id) 
//	{
//		return acknowledgementService.showMessageHeaderById(id); 
//	}
//
//}