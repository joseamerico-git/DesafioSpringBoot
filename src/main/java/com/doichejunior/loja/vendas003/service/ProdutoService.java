package com.doichejunior.loja.vendas003.service;

import com.doichejunior.loja.vendas003.model.Produto;

public interface ProdutoService {

	Iterable<Produto> buscarTodos();

	Produto buscarPorId(Long id);

	void inserir(Produto produto);

	void atualizar(Long id, Produto produto);

	void deletar(Long id);

}
