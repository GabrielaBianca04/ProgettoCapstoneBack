package Capstone.BellaMbriana.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Prenotazione")
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "ora")
    private LocalTime ora;

    @Column(name = "numeroPersone")
    private Integer numeroPersone;

    @Column(name = "nome")
    private String nome;


}
