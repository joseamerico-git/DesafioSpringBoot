package com.doichejunior.loja.vendas003.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doichejunior.loja.vendas003.model.Venda;
import com.doichejunior.loja.vendas003.repository.VendaRepository;
import com.doichejunior.loja.vendas003.service.VendaService;

@Service
public class VendaServiceImpl implements VendaService {

	// Singleton: injetar os componentes do Spring com @AutoWired;
	@Autowired
	private VendaRepository vendaRepository;

	@Override
	public Iterable<Venda> buscarTodos() {

		return vendaRepository.findAll();
	}

	@Override
	public Venda buscarPorId(Long id) {
		// TODO Auto-generated method stub
		Optional<Venda> venda = vendaRepository.findById(id);
		return venda.get();
	}

	@Override
	public void inserir(Venda venda) {
		salvaVenda(venda);

	}

	@Override
	public void atualizar(Long id, Venda venda) {
		Optional<Venda> vendaById = vendaRepository.findById(id);
		if (vendaById.isPresent()) {
			salvaVenda(venda);
		}

	}

	@Override
	public void deletar(Long id) {
		vendaRepository.deleteById(id);

	}

	private void salvaVenda(Venda venda) {

		vendaRepository.save(venda);
	}

}
