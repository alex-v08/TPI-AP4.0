package com.sri.pi.servicio.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Servicio {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long Id;

    private String Description;

    private String Category;


}
