package com.example.HL7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HL7.entity.MessageHeader;
import com.example.HL7.repository.MessageHeaderRepository;

@Service
public class MessageHeaderService 
{

	
	@Autowired
	private MessageHeaderRepository  messageHeaderRepository;
	
	public void messageHeaderService(MessageHeader messageHeader)
	{
		messageHeaderRepository.save(messageHeader);
	}
	
	
	public MessageHeader showMessageHeaderById(Integer id)
	{
		return	messageHeaderRepository.findById(id).get();
		 
	}
	
}
