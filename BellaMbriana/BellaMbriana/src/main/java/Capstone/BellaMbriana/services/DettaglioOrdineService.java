package Capstone.BellaMbriana.services;

import Capstone.BellaMbriana.entities.DettaglioOrdine;
import Capstone.BellaMbriana.repositories.DettaglioOrdineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DettaglioOrdineService {

    @Autowired
    private DettaglioOrdineRepository dettaglioOrdineRepository;

    public List<DettaglioOrdine> getAllDettagliOrdine() {
        return dettaglioOrdineRepository.findAll();
    }

    public DettaglioOrdine getDettaglioOrdineById(UUID id) {
        return dettaglioOrdineRepository.findById(id).orElse(null);
    }

    public DettaglioOrdine saveDettaglioOrdine(DettaglioOrdine dettaglioOrdine) {
        return dettaglioOrdineRepository.save(dettaglioOrdine);
    }

    public void deleteDettaglioOrdine(UUID id) {
        dettaglioOrdineRepository.deleteById(id);
    }
}
