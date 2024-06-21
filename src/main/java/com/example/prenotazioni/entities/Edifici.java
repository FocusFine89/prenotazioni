package com.example.prenotazioni.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "edifici")
public class Edifici {
    //Atrributi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name = "name")
    protected String name;

    @Column(name = "address")
    protected String address;

    @Column(name = "city")
    protected String city;

    @OneToMany(mappedBy = "edificio")
    protected List<Postazioni> postazioni;

    //Costruttori
    public Edifici(){}

    public Edifici(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    //Metodi
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Edifici{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
