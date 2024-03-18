package Capstone.BellaMbriana.services;

import Capstone.BellaMbriana.entities.Prodotto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarrelloService {

    private List<Prodotto> carrello = new ArrayList<>();

    public void aggiungiAlCarrello(Prodotto prodotto) {
        carrello.add(prodotto);
    }

    public void rimuoviDalCarrello(String id) {
        // Implementa la logica per rimuovere il prodotto dal carrello usando l'ID
        // Esempio: carrello.removeIf(prodotto -> prodotto.getId().equals(id));
    }

    public List<Prodotto> getContenutoCarrello() {
        return carrello;
    }


}
