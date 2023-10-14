package com.doichejunior.loja.vendas003.service;

import com.doichejunior.loja.vendas003.model.ItemVenda;

public interface ItemVendaService {

	Iterable<ItemVenda> buscarTodos();

	ItemVenda buscarPorId(Long id);

	void inserir(ItemVenda itemVenda);

	void atualizar(Long id, ItemVenda itemVenda);

	void deletar(Long id);

}
