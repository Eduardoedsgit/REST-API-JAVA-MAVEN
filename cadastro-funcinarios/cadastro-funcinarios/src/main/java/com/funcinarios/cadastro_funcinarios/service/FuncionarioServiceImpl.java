package com.funcinarios.cadastro_funcinarios.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.funcinarios.cadastro_funcinarios.dto.FuncionarioRequest;
import com.funcinarios.cadastro_funcinarios.dto.FuncionarioResponse;
import com.funcinarios.cadastro_funcinarios.dto.FuncionarioUpdateRequest;
import com.funcinarios.cadastro_funcinarios.exception.FuncionarioJaExisteException;
import com.funcinarios.cadastro_funcinarios.exception.FuncionarioNaoEncontradoException;
import com.funcinarios.cadastro_funcinarios.model.Funcionario;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    private final Map<Long, Funcionario> banco = new HashMap<>();
    private long idCounter = 1;

    @Override
    public FuncionarioResponse cadastrar(FuncionarioRequest request) {

        boolean cpfExiste = banco.values().stream()
                .anyMatch(f -> f.getCpf().equals(request.getCpf()));

        if (cpfExiste) {
            throw new FuncionarioJaExisteException("Já existe um funcionário com este CPF");
        }

        Funcionario funcionario = new Funcionario(
                idCounter++,
                request.getNome(),
                request.getCpf(),
                request.getIdade(),
                request.getCargo());

        banco.put(funcionario.getId(), funcionario);

        return new FuncionarioResponse(
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getIdade(),
                funcionario.getCargo());
    }

    @Override
    public FuncionarioResponse buscar(Long id) {
        Funcionario funcionario = banco.get(id);

        if (funcionario == null) {
            throw new FuncionarioNaoEncontradoException("Funcionário não encontrado");
        }

        return new FuncionarioResponse(
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getIdade(),
                funcionario.getCargo());
    }

    @Override
    public FuncionarioResponse alterar(FuncionarioUpdateRequest request) {

        Funcionario funcionario = banco.get(request.getId());

        if (funcionario == null) {
            throw new FuncionarioNaoEncontradoException("Funcionário não encontrado para alteração");
        }

        funcionario.setNome(request.getNome());
        funcionario.setIdade(request.getIdade());
        funcionario.setCargo(request.getCargo());

        return new FuncionarioResponse(
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getIdade(),
                funcionario.getCargo());
    }

    @Override
    public String deletar(Long id) {
        Funcionario funcionario = banco.remove(id);

        if (funcionario == null) {
            throw new FuncionarioNaoEncontradoException("Funcionário não encontrado para exclusão");
        }

        return "Funcionário removido com sucesso!";
    }

}