package Capstone.BellaMbriana.controller;

import Capstone.BellaMbriana.entities.Prodotto;
import Capstone.BellaMbriana.repositories.ProdottoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prodotti")
public class ProdottoController {
    @Autowired
    private ProdottoRepository prodottoRepository;

    @PostMapping("/aggiungi")
    public ResponseEntity<?> aggiungiProdotti(@RequestBody List<Prodotto> prodotti) {
        prodottoRepository.saveAll(prodotti);
        return new ResponseEntity<>("Prodotti aggiunti con successo", HttpStatus.CREATED);
    }
}
