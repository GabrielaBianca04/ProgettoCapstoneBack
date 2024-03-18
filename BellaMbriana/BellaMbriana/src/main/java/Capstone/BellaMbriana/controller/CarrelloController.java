package Capstone.BellaMbriana.controller;
import Capstone.BellaMbriana.entities.Prodotto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carrello")
public class CarrelloController {

    private List<Prodotto> carrello = new ArrayList<>();

    @PostMapping
    public ResponseEntity<?> aggiungiAlCarrello(@RequestBody Prodotto prodotto) {
        carrello.add(prodotto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Prodotto aggiunto al carrello");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> rimuoviDalCarrello(@PathVariable String id) {
        // Implementa la logica per rimuovere il prodotto dal carrello usando l'ID
        // Esempio: carrello.removeIf(prodotto -> prodotto.getId().equals(id));
        return ResponseEntity.ok("Prodotto rimosso dal carrello");
    }

    @GetMapping
    public ResponseEntity<List<Prodotto>> getContenutoCarrello() {
        return ResponseEntity.ok(carrello);
    }
}
