package com.doichejunior.loja.vendas003.service;

import com.doichejunior.loja.vendas003.model.Cliente;

//Strategy
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
