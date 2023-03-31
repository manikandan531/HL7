package com.example.HL7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HL7.entity.Acknowledgement;
import com.example.HL7.entity.Sender;
import com.example.HL7.repository.AcknowledgementRepository;
import com.example.HL7.repository.SenderRepository;

@Service
public class AcknowledgementService 
{
	@Autowired
	private AcknowledgementRepository  acknowledgementRepository;
	
	public void acknowledgementService(Acknowledgement acknowledgement)
	{
		acknowledgementRepository.save(acknowledgement);
	}

	public Acknowledgement showMessageHeaderById(Integer id) 
	{
		
		return acknowledgementRepository.findById(id).get();
	}


}
