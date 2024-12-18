package com.birth.Phrases.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="frases")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String frase;
    private String personagem;
    private String poster;
}
