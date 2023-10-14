package com.doichejunior.loja.vendas003.service;

import com.doichejunior.loja.vendas003.model.Venda;

public interface VendaService {

	Iterable<Venda> buscarTodos();

	Venda buscarPorId(Long id);

	void inserir(Venda venda);

	void atualizar(Long id, Venda venda);

	void deletar(Long id);

}
