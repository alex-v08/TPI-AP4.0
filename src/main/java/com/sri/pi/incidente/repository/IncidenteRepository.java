package com.sri.pi.incidente.repository;

import com.sri.pi.incidente.model.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenteRepository extends JpaRepository<Incidente, Long> {
}
