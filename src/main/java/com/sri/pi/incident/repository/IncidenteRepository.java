package com.sri.pi.incident.repository;

import com.sri.pi.incident.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenteRepository extends JpaRepository<Incident, Long> {
}
