package com.doichejunior.loja.vendas003.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doichejunior.loja.vendas003.model.Produto;
import com.doichejunior.loja.vendas003.repository.ProdutoRepository;
import com.doichejunior.loja.vendas003.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public Iterable<Produto> buscarTodos() {
		// TODO Auto-generated method stub
		return produtoRepository.findAll();
	}

	@Override
	public Produto buscarPorId(Long id) {
		// TODO Auto-generated method stub
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto.get();
	}

	@Override
	public void inserir(Produto produto) {
		produtoRepository.save(produto);

	}

	@Override
	public void atualizar(Long id, Produto produto) {
		Optional<Produto> produtoRecuperado = produtoRepository.findById(id);
		if (produtoRecuperado.isPresent()) {
			produtoRepository.save(produto);
		}

	}

	@Override
	public void deletar(Long id) {
		produtoRepository.deleteById(id);

	}

}
