package com.sri.pi.dptoComercial;

import com.sri.pi.client.model.Client;
import com.sri.pi.dptoComercial.entity.DptoComercial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<DptoComercial, Long> {

    public void  createNewClient (Client client);
}
