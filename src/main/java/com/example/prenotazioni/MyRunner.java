package com.example.prenotazioni;

import com.example.prenotazioni.entities.*;
import com.example.prenotazioni.services.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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


        //Aggiunta Postazioni nel DB
//        Edifici edificio3 = generalService.findByName("edificio3");
//        try{
//           Postazioni postazione1 = new Postazioni("Postazione Privata", PostazioniType.PRIVATO,5, edificio3);
//           generalService.savePostazione(postazione1);
//
//            Postazioni postazione2 = new Postazioni("Postazione Openspace", PostazioniType.OPENSPACE,10, edificio3);
//            generalService.savePostazione(postazione1);
//
//            Postazioni postazione3 = new Postazioni("Postazione Sala Riunioni", PostazioniType.SALA_RIUNIONI,20, edificio3);
//            generalService.savePostazione(postazione1);
//
//            generalService.savePostazione(postazione1);
//            generalService.savePostazione(postazione2);
//            generalService.savePostazione(postazione3);
//
//
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

        //Creazione Utenti
//        try{
//            Utenti utente1 = new Utenti("nikita","Nikita Ivanov","nikita@gmail.com");
//            generalService.saveUtente(utente1);
//
//            Utenti utente2 = new Utenti("aldo","Aldo Moro","aldo@gmail.com");
//            generalService.saveUtente(utente2);
//
//            Utenti utente3 = new Utenti("pacciani","Pietro Pacciani","pacciani@gmail.com");
//            generalService.saveUtente(utente3);
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }

      // System.out.println(generalService.PostazioniByTypeAndCity(PostazioniType.PRIVATO, "Milano"));


    }
}
