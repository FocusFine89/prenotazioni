package com.example.prenotazioni.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "postazioni")
public class Postazioni {
    //Attributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name = "description")
    protected String description;

    @Column(name = "type")
    protected PostazioniType type;

    @Column(name = "occupants")
    protected int occupants;


    @ManyToOne
    @JoinColumn(name = "edificio", nullable = false)
    protected Edifici edificio;

    @OneToMany(mappedBy = "postazione")
    protected List<Prenotazioni> prenotazione;

    //Costruttori
    public Postazioni(){}

    public Postazioni(String description, PostazioniType type, int occupants, Edifici edificio) {
        this.description = description;
        this.type = type;
        this.occupants = occupants;
        this.edificio = edificio;
    }

    //Metodi


    public long getId() {
        return id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PostazioniType getType() {
        return type;
    }

    public void setType(PostazioniType type) {
        this.type = type;
    }

    public int getOccupants() {
        return occupants;
    }

    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    @Override
    public String toString() {
        return "Postazioni{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", occupants=" + occupants +
                '}';
    }
}
