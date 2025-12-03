package com.funcinarios.cadastro_funcinarios.service;

import com.funcinarios.cadastro_funcinarios.dto.FuncionarioRequest;
import com.funcinarios.cadastro_funcinarios.dto.FuncionarioResponse;
import com.funcinarios.cadastro_funcinarios.dto.FuncionarioUpdateRequest;

public interface FuncionarioService {

    FuncionarioResponse cadastrar(FuncionarioRequest request);

    FuncionarioResponse buscar(Long id);

    FuncionarioResponse alterar(FuncionarioUpdateRequest request);

    String deletar(Long id);
}