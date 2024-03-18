package Capstone.BellaMbriana.services;

import Capstone.BellaMbriana.entities.Recensione;
import Capstone.BellaMbriana.repositories.RecensioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class RecensioneService {

    @Autowired
    private RecensioneRepository recensioneRepository;

    public List<Recensione> getAllRecensioni() {
        return recensioneRepository.findAll();
    }

    public Recensione getRecensioneById(UUID id) {
        return recensioneRepository.findById(id).orElse(null);
    }

    public Recensione saveRecensione(Recensione recensione) {
        return recensioneRepository.save(recensione);
    }

    public void deleteRecensione(UUID id) {
        recensioneRepository.deleteById(id);
    }

    // Altri metodi di servizio per operazioni specifiche se necessario
}
