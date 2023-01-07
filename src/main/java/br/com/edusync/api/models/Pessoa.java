package br.com.edusync.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private Integer id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

}
