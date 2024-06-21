package com.example.prenotazioni.repositories;

import com.example.prenotazioni.entities.Prenotazioni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioniRepository extends JpaRepository<Prenotazioni, Long> {

    //DERIVED QUERIES


}
