package com.funcinarios.cadastro_funcinarios.exception;

import java.time.LocalDateTime;

public class ErroApi {
    private LocalDateTime data;
    private String mensagem;

    public ErroApi(LocalDateTime data, String mensagem) {
        this.data = data;
        this.mensagem = mensagem;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getMensagem() {
        return mensagem;
    }
}