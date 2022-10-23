package com.pjem.pessoa.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private int id;

    @NotBlank(message="Nome não pode estar em branco")
    @Size(min = 3, max = 200)
    private String nome;

    @Email(message="E-mail inválido")
    private String email;

    @NotBlank(message="Aniversário não pode estar em branco")
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy", locale="pt-BR", timezone = "Brazil / East")
    private LocalDate aniversario;
}
