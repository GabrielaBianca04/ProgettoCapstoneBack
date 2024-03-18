package Capstone.BellaMbriana.repositories;

import Capstone.BellaMbriana.entities.Immagine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ImmagineRepository extends JpaRepository<Immagine, UUID> {

}
