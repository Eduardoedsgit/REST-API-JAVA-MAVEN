package com.funcinarios.cadastro_funcinarios.dto;

import jakarta.validation.constraints.*;

public class FuncionarioUpdateRequest {

    @NotNull(message = "ID é obrigatório")
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @Min(value = 18, message = "Idade mínima é 18 anos")
    private int idade;

    @NotBlank(message = "Cargo é obrigatório")
    private String cargo;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }
}