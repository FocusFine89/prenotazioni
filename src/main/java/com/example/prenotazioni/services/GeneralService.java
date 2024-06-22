package com.example.prenotazioni.services;

import com.example.prenotazioni.entities.*;
import com.example.prenotazioni.repositories.EdificiRepository;
import com.example.prenotazioni.repositories.PostazioniRepository;
import com.example.prenotazioni.repositories.PrenotazioniRepository;
import com.example.prenotazioni.repositories.UtentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class GeneralService {

    @Autowired
    private EdificiRepository edificiRepository;

    @Autowired
    private PostazioniRepository postazioniRepository;

    @Autowired
    private PrenotazioniRepository prenotazioniRepository;

    @Autowired
    private UtentiRepository utentiRepository;

    //Edifici
    public void saveEdificio(Edifici newEdificio){
        if(edificiRepository.existsByName(newEdificio.getName())){
            throw new RuntimeException("l'edificio già esiste, prova a cambiargli il nome");
        }
        edificiRepository.save(newEdificio);
        System.out.println("L'edificio " + newEdificio.getName() + " aggiunto!");
    }

    public Edifici findEdificioByName(String name){
        if(edificiRepository.findByName(name) == null){
            throw new RuntimeException("Edificio non trovato");
        }
        return edificiRepository.findByName(name);
    }


    //Postazioni
    public void savePostazione(Postazioni newPostazione){
        postazioniRepository.save(newPostazione);
        System.out.println("Postazione aggiunta!");
    }

    public List<Postazioni> findByType(PostazioniType type){
        return postazioniRepository.findByType(type);
    }


    public List<Postazioni> PostazioniByTypeAndCity(PostazioniType type, String city){
        return postazioniRepository.findByTypeAndCity(type,city);
    }

    public Postazioni findPostazioneById(long id){
        return postazioniRepository.findById(id);
    }


    //Utenti
    public void saveUtente(Utenti newUtente){
        if (utentiRepository.existsByUsername(newUtente.getUsername())){
            throw  new RuntimeException("L'utente " + newUtente.getUsername() + "già esiste, prova a cambiare username!");
        }
        utentiRepository.save(newUtente);
        System.out.println("L'utente " + newUtente.getUsername() + " è stato aggiunto!");
    }

    public Utenti findByUsername(String username){
        if(utentiRepository.existsByUsername(username)){
            return utentiRepository.findByUsername(username);
        }else{
            throw new RuntimeException("Non ho trovato l'utente");
        }
    }

    //Prenotazioni

    public void savePrenotazione(Prenotazioni newPrenotazione){
        prenotazioniRepository.save(newPrenotazione);
    }



}
