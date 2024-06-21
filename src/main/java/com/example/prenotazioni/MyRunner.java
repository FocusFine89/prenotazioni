package com.example.prenotazioni;

import com.example.prenotazioni.services.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    //Autowired sul service per usare tutti i metodi CRUD
    @Autowired
    GeneralService generalService;

    @Override
    public void run(String... args) throws Exception {
        // Context per prendere Edifici e Postazioni creati nel bean
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PrenotazioniApplication.class);



        // Nel Runner creare solo Utenti e Prenotazioni

        // Il ragionamento è, gli edifici e le postazioni già devono esistere, poi arriva un Utente e fa una Prenotazione

        // quindi prima di creare la prenotazione si crea l'utente

        // poi si crea la prenotazione passangli l'Utente e la Postazione (andandola a prendere dal Persistence)


        //Inizio a mettere edifici e postazioni nel database

    }
}
