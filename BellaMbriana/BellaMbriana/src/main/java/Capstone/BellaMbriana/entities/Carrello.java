package Capstone.BellaMbriana.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Carrello {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "carrello", cascade = CascadeType.ALL)
    private List<Ordine> ordini;

    @ManyToMany
    @JoinTable(name = "Carrello_Prodotto",
            joinColumns = @JoinColumn(name = "carrello_id"),
            inverseJoinColumns = @JoinColumn(name = "prodotto_id"))
    private List<Prodotto> prodotti;

}
