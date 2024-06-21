package com.example.prenotazioni.repositories;

import com.example.prenotazioni.entities.Edifici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EdificiRepository extends JpaRepository<Edifici, Long> {
    //Già si hanno a disposizione i metodi CRUD

    //DERIVED QUERIS
    Edifici findByName(String name);

    boolean existsByName(String name);

}
