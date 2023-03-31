package com.example.HL7.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.HL7.entity.Acknowledgement;
import com.example.HL7.service.AcknowledgementService;
import com.example.HL7.service.FileReader;
import com.example.HL7.service.MessageHeaderService;
import com.example.HL7.service.ReceiverService;
import com.example.HL7.service.SenderService;

@RestController
public class Controller 
{

	@Autowired
	private MessageHeaderService messageService;
	
	@Autowired
	private SenderService senderService;
	
	@Autowired
	private ReceiverService receiverService;
	
	@Autowired
	private AcknowledgementService acknowledgementService;
	
	

	@Autowired
	private FileReader fileReader;

//	@GetMapping("/api/hl7/facility/{search}")
//	public Optional<Facility> searchFacilityById(@PathVariable int search) {
//	return facilityService.getFacilityById(search);
//    }

	@PostMapping("/api/hl7/create")
	public ResponseEntity<Object> fileUpload(@RequestParam("file") MultipartFile file) throws IOException 
	{
	return fileReader.fileUpload(file);
	}
}