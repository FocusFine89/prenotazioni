package com.example.prenotazioni;

import org.springframework.stereotype.Component;

@Component
public class MyRunner {

    // Nel Runner creare solo Utenti e Prenotazioni

    // Il ragionamento è, gli edifici e le postazioni già devono esistere, poi arriva un Utente e fa una Prenotazione
    // quindi prima di creare la prenotazione si crea l'utente
    // poi si crea la prenotazione passangli l'Utente e la Postazione (andandola a prendere dal Persistence)
}
