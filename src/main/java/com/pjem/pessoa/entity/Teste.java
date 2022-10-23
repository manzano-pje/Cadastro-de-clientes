package com.pjem.pessoa.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class Teste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private LocalDate aniversario;

   public Teste(String nome, String email, LocalDate aniversario) {

        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }
}
