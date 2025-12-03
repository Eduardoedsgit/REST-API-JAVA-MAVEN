package com.funcinarios.cadastro_funcinarios.exception;

public class FuncionarioJaExisteException extends RuntimeException {
    public FuncionarioJaExisteException(String mensagem) {
        super(mensagem);
    }
}