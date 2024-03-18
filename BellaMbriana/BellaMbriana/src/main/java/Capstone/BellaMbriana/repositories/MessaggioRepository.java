package Capstone.BellaMbriana.repositories;

import Capstone.BellaMbriana.entities.Messaggio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface MessaggioRepository extends JpaRepository<Messaggio, UUID> {
}

