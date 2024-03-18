package Capstone.BellaMbriana.repositories;
import Capstone.BellaMbriana.entities.DettaglioOrdine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DettaglioOrdineRepository extends JpaRepository<DettaglioOrdine, UUID> {
}
