package com.example.prenotazioni.repositories;

import com.example.prenotazioni.entities.Postazioni;
import com.example.prenotazioni.entities.PostazioniType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioniRepository extends JpaRepository<Postazioni, Long> {

    //DERIVED QUERIES
    List<Postazioni> findByType(PostazioniType type);
    Postazioni findById(long id);


    // JPQL QUERIES
    @Query("SELECT p FROM Postazioni p WHERE p.type = :type AND p.edificio.city = :city")
    List<Postazioni> findByTypeAndCity(@Param("type") PostazioniType type, @Param("city") String city);

}
