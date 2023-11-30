package com.sri.pi.rrhh.repository;

import com.sri.pi.helpdesk.entity.HelpDesk;
import com.sri.pi.rrhh.model.Rrhh;
import com.sri.pi.technician.entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RrhhRepository extends JpaRepository<Rrhh, Long> {

    public void createNewtechnician (Technician technician);
    public void createNewHelpDesk (HelpDesk helpDesk);
}
