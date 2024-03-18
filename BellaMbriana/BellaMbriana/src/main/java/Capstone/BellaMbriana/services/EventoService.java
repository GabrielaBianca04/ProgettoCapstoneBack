package Capstone.BellaMbriana.services;

import Capstone.BellaMbriana.entities.Evento;
import Capstone.BellaMbriana.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> getAllEventi() {
        return eventoRepository.findAll();
    }

    public Evento getEventoById(UUID id) {
        return eventoRepository.findById(id).orElse(null);
    }

    public Evento saveEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    public void deleteEvento(UUID id) {
        eventoRepository.deleteById(id);
    }

}
