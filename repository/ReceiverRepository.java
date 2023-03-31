package com.example.HL7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HL7.entity.Receiver;

@Repository
public interface ReceiverRepository  extends JpaRepository<Receiver,Integer>
{

}
