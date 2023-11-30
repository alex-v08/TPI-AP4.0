package com.sri.pi.incident.model;


import com.sri.pi.client.model.Client;

import com.sri.pi.technician.entity.Technician;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

import java.util.Set;


@Data
@Entity

public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String description;
    private String troubleShooting;



    @OneToMany(mappedBy = "incidente")
    @JoinTable (name = "incidente_especialidad",
            joinColumns = @JoinColumn(name = "incidente_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
    private Set<Technician> technicians;


    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client;

    private LocalDate estimateTime;



    private LocalDate closedDate;

    private Boolean isResolved;


}
