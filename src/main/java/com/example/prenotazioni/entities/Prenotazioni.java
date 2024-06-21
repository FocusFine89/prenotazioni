package com.example.prenotazioni.entities;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
public class Prenotazioni {
    //Attributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name = "data_prenotazione")
    protected LocalDate dataPrenotazione;

    @ManyToOne
    @JoinColumn(name = "postazione", nullable = false)
    protected Postazioni postazione;

    @ManyToOne
    @JoinColumn(name = "utente",nullable = false)
    protected Utenti utente;

    //Costruttori
    public Prenotazioni(){}

    public Prenotazioni(LocalDate dataPrenotazione, Postazioni postazione, Utenti utente ) {
        this.dataPrenotazione = dataPrenotazione;
        this.postazione = postazione;
        this.utente = utente;

    }

    //Metodi

    public long getId() {
        return id;
    }

    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    @Override
    public String toString() {
        return "Prenotazioni{" +
                "id=" + id +
                ", dataPrenotazione=" + dataPrenotazione +
                '}';
    }
}
