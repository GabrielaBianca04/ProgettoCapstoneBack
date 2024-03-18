package Capstone.BellaMbriana.controller;
import Capstone.BellaMbriana.entities.Immagine;
import Capstone.BellaMbriana.repositories.ImmagineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api/immagini")
public class ImmagineController {

    @Autowired
    private ImmagineRepository immagineRepository;

    @GetMapping
    public List<Immagine> getAllImages() {
        return immagineRepository.findAll();
    }
}
