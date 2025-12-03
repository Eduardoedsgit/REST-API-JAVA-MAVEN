package com.funcinarios.cadastro_funcinarios.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FuncionarioResponse {
    private Long id;
    private String nome;
    private int idade;
    private String cargo;
}