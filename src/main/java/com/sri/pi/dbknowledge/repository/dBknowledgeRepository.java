package com.sri.pi.dbknowledge.repository;

import com.sri.pi.dbknowledge.model.DbKnowledge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface dBknowledgeRepository extends JpaRepository<DbKnowledge, Long> {
}
