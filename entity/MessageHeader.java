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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "messageheader")
public class MessageHeader 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name = "field_separator")
    private String fieldSeparator;

    @Column(name = "encoding_characters")
    private String encodingCharacters;

    @Column(name = "message_type")
    private String messageType;

    @Column(name = "trigger_event")
    private String triggerEvent;

    @Column(name = "message_control_id")
    private String messageControlId;

    @Column(name = "processing_id")
    private String processingId;

    @Column(name = "version_id")
    private String versionId;

    @Column(name = "date_time_of_message")
    private String dateTimeOfMessage;

   
}

