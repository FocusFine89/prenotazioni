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

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public Postazioni getPostazione() {
        return postazione;
    }

    public void setPostazione(Postazioni postazione) {
        this.postazione = postazione;
    }

    public Utenti getUtente() {
        return utente;
    }

    public void setUtente(Utenti utente) {
        this.utente = utente;
    }

    @Override
    public String toString() {
        return "Prenotazioni{" +
                "id=" + id +
                ", dataPrenotazione=" + dataPrenotazione +
                '}';
    }
}
