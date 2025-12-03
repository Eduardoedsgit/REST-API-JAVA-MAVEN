package com.funcinarios.cadastro_funcinarios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
    private Long id;
    private String nome;
    private String cpf; // dado sensível → NÃO aparece na resposta
    private int idade;
    private String cargo;
}