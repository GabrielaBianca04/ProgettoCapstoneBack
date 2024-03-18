package Capstone.BellaMbriana.services;

import Capstone.BellaMbriana.entities.Prenotazione;
import Capstone.BellaMbriana.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public List<Prenotazione> getAllPrenotazioni() {
        return prenotazioneRepository.findAll();
    }

    public Prenotazione getPrenotazioneById(UUID id) {
        return prenotazioneRepository.findById(id).orElse(null);
    }

    public Prenotazione savePrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    public void deletePrenotazione(UUID id) {
        prenotazioneRepository.deleteById(id);
    }

    // Altri metodi di servizio per operazioni specifiche se necessario
}
