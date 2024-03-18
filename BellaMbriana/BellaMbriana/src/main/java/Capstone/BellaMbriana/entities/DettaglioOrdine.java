package Capstone.BellaMbriana.entities;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DettagliOrdine")
public class DettaglioOrdine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "Prodotto")
    private UUID prodotto;

    @Column(name = "Ordine")
    private UUID ordine;

    @Column(name = "prezzo")
    private Double prezzo;

    @Column(name = "quantita")
    private Integer quantita;

    // Costruttori, getter e setter
}
