package com.funcinarios.cadastro_funcinarios.dto;

import jakarta.validation.constraints.*;

public class FuncionarioRequest {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "CPF é obrigatório")
    @Pattern(regexp = "\\d{11}", message = "O CPF deve conter 11 números")
    private String cpf;

    @Min(value = 18, message = "Idade mínima é 18 anos")
    private int idade;

    @NotBlank(message = "Cargo é obrigatório")
    private String cargo;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }
}