package Capstone.BellaMbriana.controller;


import Capstone.BellaMbriana.entities.Ordine;
import Capstone.BellaMbriana.repositories.OrdineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordini")
public class OrdineController {

    @Autowired
    private OrdineRepository ordineRepository;

    @GetMapping
    public List<Ordine> getAllOrders() {
        return ordineRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> createOrder(@RequestBody Ordine ordine) {

        if (ordine.getProductName() == null || ordine.getTotalPrice() <= 0) {
            return ResponseEntity.badRequest().body("Dati dell'ordine incompleti o non validi");
        }
        ordineRepository.save(ordine);
        return ResponseEntity.ok("Ordine creato con successo");
    }
}
