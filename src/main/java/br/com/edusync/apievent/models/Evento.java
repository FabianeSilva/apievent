package br.com.edusync.apievent.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @CollectionTable(name = "id")
    private Integer codigo;

    @Column(length = 150)
    private String nomeDoEvento;
    private String descricao;
    private LocalDate data;
    private List<Participantes> participantes = new ArrayList<>();
}

