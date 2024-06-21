package com.example.prenotazioni.repositories;

import com.example.prenotazioni.entities.Utenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtentiRepository extends JpaRepository<Utenti, Long> {

    //DERIVED QUERIES
    boolean existByUsername(String name);
}
