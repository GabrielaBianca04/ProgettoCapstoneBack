package Capstone.BellaMbriana.services;

import Capstone.BellaMbriana.entities.Prodotto;
import Capstone.BellaMbriana.repositories.ProdottoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ProdottoService {

    @Autowired
    private ProdottoRepository prodottoRepository;

    public List<Prodotto> getAllProdotti() {
        return prodottoRepository.findAll();
    }

    public Prodotto getProdottoById(UUID id) {
        return prodottoRepository.findById(id).orElse(null);
    }

    public Prodotto saveProdotto(Prodotto prodotto) {
        return prodottoRepository.save(prodotto);
    }

    public void deleteProdotto(UUID id) {
        prodottoRepository.deleteById(id);
    }

}
