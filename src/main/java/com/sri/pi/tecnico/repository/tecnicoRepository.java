package com.sri.pi.tecnico.repository;

import com.sri.pi.tecnico.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tecnicoRepository extends JpaRepository<Tecnico, Long> {
}
