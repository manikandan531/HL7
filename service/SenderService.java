package com.example.HL7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HL7.entity.MessageHeader;
import com.example.HL7.entity.Sender;
import com.example.HL7.repository.MessageHeaderRepository;
import com.example.HL7.repository.SenderRepository;

@Service
public class SenderService 
{
	
	@Autowired
	private SenderRepository  senderRepository;
	
	public void senderService(Sender sender)
	{
		senderRepository.save(sender);
	}

	public Sender showSenderById(Integer id) 
	{
		return senderRepository.findById(id).get();
	}

}
