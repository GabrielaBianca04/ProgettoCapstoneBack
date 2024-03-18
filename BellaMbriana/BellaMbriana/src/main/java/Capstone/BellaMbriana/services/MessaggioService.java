package Capstone.BellaMbriana.services;

import Capstone.BellaMbriana.entities.Messaggio;
import Capstone.BellaMbriana.repositories.MessaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class MessaggioService {

    @Autowired
    private MessaggioRepository messaggioRepository;

    public List<Messaggio> getAllMessaggi() {
        return messaggioRepository.findAll();
    }

    public Messaggio getMessaggioById(UUID id) {
        return messaggioRepository.findById(id).orElse(null);
    }

    public static Messaggio saveMessaggio(Messaggio messaggio) {
        return messaggioRepository.save(messaggio);
    }

    public void deleteMessaggio(UUID id) {
        messaggioRepository.deleteById(id);
    }


}
