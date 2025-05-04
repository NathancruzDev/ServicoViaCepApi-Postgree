package edu.desafio.dp.service;

import edu.desafio.dp.model.ClienteModel;

public interface ClienteService {
    Iterable<ClienteModel> buscarTodos();

    ClienteModel buscarPorId(Long id);

    void inserir(ClienteModel cliente);

    void atualizar(Long id, ClienteModel cliente);

    void deletar(Long id);
}
