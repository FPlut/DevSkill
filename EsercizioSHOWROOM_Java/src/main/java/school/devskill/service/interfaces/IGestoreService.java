package school.devskill.service.interfaces;

import school.devskill.Veicoli.Veicolo;

import java.util.List;

public interface IGestoreService {
 Veicolo cercaVeicolo(String nome, int anno);


/** Funzione che permette di restituire il piú vecchio veicolo generico inserendo 0, moto inserendo 1 e un auto inserendo 2 **/
  Veicolo restituisciOldestVeicolo(int s);


/** Funzione che permette di restituire il piú nuovo veicolo generico inserendo 0, moto inserendo 1 e un auto inserendo 2 **/
  Veicolo restituisciNewestVeicolo(int s);



/** Funzione che permette di restituire il piú prezzo medio di veicoli generici inserendo 0, moto inserendo 1 e auto inserendo 2 **/
  Double prezzoMedio(int scelta);




 void aggiungiVeicoli(List<Veicolo> daAggiungere);

 void rimuoviVeicoli(List<Veicolo> daRimuovere) ;


 void aggingiVeicolo(Veicolo v);



}
