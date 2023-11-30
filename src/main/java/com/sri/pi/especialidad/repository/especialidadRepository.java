package com.sri.pi.especialidad.repository;


import com.sri.pi.especialidad.model.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface especialidadRepository extends JpaRepository<Especialidad, Long> {


}
