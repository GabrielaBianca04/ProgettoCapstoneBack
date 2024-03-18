package Capstone.BellaMbriana.entities;

import enums.StatoOrdine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Ordine")
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "ora")
    private LocalTime ora;

    @Column(name = "stato")
    @Enumerated
    private StatoOrdine stato;

    @Column(name = "totale")
    private Double totale;

    @Column(name = "noteSpeciali")
    private String noteSpeciali;

    @Column(name = "dettagliPagamento")
    private String dettagliPagamento;

    @ManyToOne
    @JoinColumn(name = "carrello_id")
    private Carrello carrello;



    @ManyToMany
    @JoinTable(name = "Ordine_Prodotto",
            joinColumns = @JoinColumn(name = "ordine_id"),
            inverseJoinColumns = @JoinColumn(name = "prodotto_id"))
    private List<Prodotto> prodotti;

    public String getProductName() {
        if (prodotti == null || prodotti.isEmpty()) {
            return "Nessun prodotto";
        }
        return prodotti.get(0).getNome();
    }

    public double getTotalPrice() {
        if (totale == null) {
            return 0.0;
        }
        return totale;
    }
}
