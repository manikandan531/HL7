package com.example.HL7.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "acknowledgement")
public class Acknowledgement {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "id_message_header")
  private String messageId;

  @Column(name = "accept_acknowledgement_type")
  private String acceptAcknowledgementType;

  @Column(name = "application_acknowledgement_type")
  private String applicationAcknowledgementType;

  @Column(name = "country_code")
  private String countryCode;

}