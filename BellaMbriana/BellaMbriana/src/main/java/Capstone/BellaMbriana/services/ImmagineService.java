package Capstone.BellaMbriana.services;

import Capstone.BellaMbriana.entities.Immagine;
import Capstone.BellaMbriana.repositories.ImmagineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ImmagineService {

    @Autowired
    private ImmagineRepository immagineRepository;

    public List<Immagine> getAllImmagini() {
        return immagineRepository.findAll();
    }

    public Immagine getImmagineById(UUID id) {
        return immagineRepository.findById(id).orElse(null);
    }

    public Immagine saveImmagine(Immagine immagine) {
        return immagineRepository.save(immagine);
    }

    public void deleteImmagine(UUID id) {
        immagineRepository.deleteById(id);
    }


}
