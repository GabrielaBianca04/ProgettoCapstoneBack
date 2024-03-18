package Capstone.BellaMbriana.services;

import Capstone.BellaMbriana.entities.Ordine;
import Capstone.BellaMbriana.repositories.OrdineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class OrdineService {

    @Autowired
    private OrdineRepository ordineRepository;

    public List<Ordine> getAllOrdini() {
        return ordineRepository.findAll();
    }

    public Ordine getOrdineById(UUID id) {
        return ordineRepository.findById(id).orElse(null);
    }

    public Ordine saveOrdine(Ordine ordine) {
        return ordineRepository.save(ordine);
    }

    public void deleteOrdine(UUID id) {
        ordineRepository.deleteById(id);
    }

    // Altri metodi di servizio per operazioni specifiche se necessario
}
