package com.sri.pi.cliente.repository;

import com.sri.pi.cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface clienteRepository extends JpaRepository<Cliente, Long> {
}
