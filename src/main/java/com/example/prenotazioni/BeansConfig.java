package com.example.prenotazioni;

import com.example.prenotazioni.entities.Edifici;
import com.example.prenotazioni.entities.Postazioni;
import com.example.prenotazioni.entities.PostazioniType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class BeansConfig {

    //Nel BeansConfig creare solo edifici e postazioni perchè già devono esistere nel momento in cui un Utente viene a fare una Prenotazione.

    //Creazione Edifici (massimo 3)
    @Bean
    public Edifici edificio1(){
        return new Edifici("edificio1","Via degli Abeti 20152","Milano");
    }

    @Bean
    public Edifici edificio2(){
        return new Edifici("edificio2","Via del Corso 00100","Roma");
    }

    @Bean
    public Edifici edificio3(){
        return new Edifici("edificio3", "Via degli Agresti 40100","Bologna");
    }


    //Creazione Postazioni ( massimo 3 ad Edificio)

    //Postazioni Edificio1
    @Bean
    public Postazioni pUnoEUno(){
        return new Postazioni("Postazione Privata", PostazioniType.PRIVATO,5,edificio1());
    }

    @Bean
    public Postazioni pDueEUno(){
        return new Postazioni("Postazione Openspace", PostazioniType.OPENSPACE, 10, edificio1());
    }

    @Bean
    public Postazioni pTreEUno(){
        return new Postazioni("Postazione Sala Riunioni", PostazioniType.SALA_RIUNIONI, 20,edificio1());
    }

    //Postazioni Edificio2
    @Bean
    public Postazioni pUnoEDue(){
        return new Postazioni("Postazione Privata", PostazioniType.PRIVATO,5, edificio2());
    }

    @Bean
    public Postazioni pDueEDue(){
        return new Postazioni("Postazione Openspace", PostazioniType.OPENSPACE,10,edificio2());
    }

    @Bean
    public Postazioni pTreEDue(){
        return new Postazioni("Postazione Sala Riunioni", PostazioniType.SALA_RIUNIONI,20,edificio2());
    }

    //Postazioni Edificio3
    @Bean
    public Postazioni pUnoETre(){
        return new Postazioni("Postazione Privata", PostazioniType.PRIVATO,5,edificio3());
    }

    @Bean
    public Postazioni pDueETre(){
        return new Postazioni("Postazione Openspace",PostazioniType.OPENSPACE,10,edificio3());
    }

    @Bean
    public Postazioni pTreETre(){
        return new Postazioni("Postazione Sala Riunioni", PostazioniType.SALA_RIUNIONI,20,edificio3());
    }
}
