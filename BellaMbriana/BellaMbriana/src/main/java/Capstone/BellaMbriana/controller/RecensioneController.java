package Capstone.BellaMbriana.controller;
import Capstone.BellaMbriana.entities.Recensione;
import Capstone.BellaMbriana.repositories.RecensioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recensioni")
public class RecensioneController {

    @Autowired
    private RecensioneRepository recensioneRepository;

    @PostMapping
    public String inviaRecensione(@RequestBody Recensione recensione) {
        recensioneRepository.save(recensione);
        return "Recensione inviata con successo";
    }
}