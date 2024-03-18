package Capstone.BellaMbriana.controller;


import Capstone.BellaMbriana.entities.Messaggio;
import Capstone.BellaMbriana.services.MessaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessaggioController {

    @Autowired
    public MessaggioController(MessaggioService messaggioService) {
    }

    @PostMapping("/messaggi")
    public ResponseEntity<String> handleContactForm(@RequestBody Messaggio messaggio) {
        try {

            if (messaggio.getMittente() == null || messaggio.getTesto() == null) {
                return ResponseEntity.badRequest().body("I campi del form sono obbligatori");
            }


         MessaggioService.saveMessaggio(messaggio);



            return ResponseEntity.ok("Messaggio inviato con successo");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Si è verificato un errore durante l'elaborazione della richiesta");
        }
    }
}
