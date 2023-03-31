package com.example.HL7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HL7.entity.Receiver;
import com.example.HL7.repository.ReceiverRepository;

@Service
public class ReceiverService 
{
		
	
	@Autowired
	private ReceiverRepository receiverRepository;
	
	public void receiverService(Receiver receiver)
	{
		receiverRepository.save(receiver);
	}

	public Receiver showReceiverById(Integer id) 
	{
		return receiverRepository.findById(id).get();
	}
}
