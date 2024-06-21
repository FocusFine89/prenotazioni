package com.example.prenotazioni.repositories;

import com.example.prenotazioni.entities.Postazioni;
import com.example.prenotazioni.entities.PostazioniType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioniRepository extends JpaRepository<Postazioni, Long> {

    //DERIVED QUERIES
    List<Postazioni> findByType(PostazioniType type);

    List<Postazioni> findByTypeAndCity(PostazioniType type, String city);
}
