package com.example.prenotazioni.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="utenti")
public class Utenti {
    //Attributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name = "username")
    protected String username;

    @Column(name = "fullname")
    protected String fullName;

    @Column(name = "email")
    protected String email;

    @OneToMany(mappedBy = "utente")
    protected List<Prenotazioni> prenotazione;

    //Costruttori
    public Utenti(){}

    public Utenti(String username, String fullName, String email) {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
    }

    //Metodi

    public long getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utenti{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
