package com.sri.pi.technician.repository;

import com.sri.pi.incident.model.Incident;
import com.sri.pi.technician.entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tecnicoRepository extends JpaRepository<Technician, Long> {

    public void closeIncident (Incident incident);
}
