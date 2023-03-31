package com.example.HL7.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "receiver")
public class Receiver {



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;

	@Column(name="id_message_header")
	private String idMessageHeader;


	@Column(name="Sending_Application_ID")
	private String receivingApplicationId;
	
	@Column(name="Sending_Facility_ID ")
	private String receivingFacilityId;


	@Column(name="Universal_ID")
	private String universalId;

	@Column(name="Universal_ID_type")
	private String universalIdType;

	}