package com.sri.pi.skill.repository;


import com.sri.pi.skill.model.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface especialidadRepository extends JpaRepository<Especialidad, Long> {


}
