package com.sri.pi.empleado.model.repository;

import com.sri.pi.empleado.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
