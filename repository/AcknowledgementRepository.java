package com.example.HL7.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HL7.entity.Acknowledgement;

@Repository
public interface AcknowledgementRepository extends JpaRepository<Acknowledgement,Integer> 
{
	
}