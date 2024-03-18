package Capstone.BellaMbriana.entities;

import enums.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Prodotto")
public class Prodotto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "prezzo")
    private Double prezzo;

    @Column(name = "categoria")
    @Enumerated
    private Categoria categoria;

    @ManyToMany(mappedBy = "prodotti")
    private List<Ordine> ordini;

    @ManyToMany(mappedBy = "prodotti")
    private List<Carrello> carrelli;
}
