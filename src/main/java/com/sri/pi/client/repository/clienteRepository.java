package com.sri.pi.client.repository;

import com.sri.pi.client.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface clienteRepository extends JpaRepository<Client, Long> {
}
