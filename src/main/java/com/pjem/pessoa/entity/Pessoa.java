package com.pjem.pessoa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private LocalDate aniversario;


}