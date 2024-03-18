package Capstone.BellaMbriana.controller;

import Capstone.BellaMbriana.entities.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eventi")
public class EventoController {

    private final List<Evento> eventi;
    public EventoController(List<Evento> eventi) {
        this.eventi = eventi;
    }

    @GetMapping("/{index}")
    public Evento getEventoByIndex(@PathVariable int index) {
        if (index >= 0 && index < eventi.size()) {
            return eventi.get(index);
        } else {
            throw new IndexOutOfBoundsException("Evento non trovato per l'indice specificato");
        }
    }

    @GetMapping("/count")
    public int getNumeroEventi() {
        return eventi.size();
    }

    @PostMapping("/add")
    public void aggiungiEvento(@RequestBody Evento nuovoEvento) {
        eventi.add(nuovoEvento);
    }

    @DeleteMapping("/{index}")
    public void rimuoviEvento(@PathVariable int index) {
        if (index >= 0 && index < eventi.size()) {
            eventi.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Evento non trovato per l'indice specificato");
        }
    }

}

