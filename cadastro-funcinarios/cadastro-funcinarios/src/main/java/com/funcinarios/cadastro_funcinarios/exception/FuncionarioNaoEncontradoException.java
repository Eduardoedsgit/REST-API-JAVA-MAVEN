package com.funcinarios.cadastro_funcinarios.exception;

public class FuncionarioNaoEncontradoException extends RuntimeException {
    public FuncionarioNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}