package com.sri.pi.helpdesk.repository;

import com.sri.pi.helpdesk.entity.HelpDesk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelpDeskRepository extends JpaRepository<HelpDesk, Long> {
}
