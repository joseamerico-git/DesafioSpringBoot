package com.doichejunior.loja.vendas003.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doichejunior.loja.vendas003.model.ItemVenda;
import com.doichejunior.loja.vendas003.repository.ItemVendaRepository;
import com.doichejunior.loja.vendas003.service.ItemVendaService;

@Service
public class ItemVendaServiceImpl implements ItemVendaService {

	// Singleton: injetar os componentes do Spring com @AutoWired;
	@Autowired
	private ItemVendaRepository itemVendaRepository;

	@Override
	public Iterable<ItemVenda> buscarTodos() {

		return itemVendaRepository.findAll();
	}

	@Override
	public ItemVenda buscarPorId(Long id) {
		// TODO Auto-generated method stub
		Optional<ItemVenda> itemVenda = itemVendaRepository.findById(id);
		return itemVenda.get();
	}

	@Override
	public void inserir(ItemVenda itemVenda) {
		adicionarItemCarrinho(itemVenda);

	}

	@Override
	public void atualizar(Long id, ItemVenda itemVenda) {
		Optional<ItemVenda> itemVendaById = itemVendaRepository.findById(id);
		if (itemVendaById.isPresent()) {
			adicionarItemCarrinho(itemVenda);
		}

	}

	@Override
	public void deletar(Long id) {
		itemVendaRepository.deleteById(id);

	}

	private void adicionarItemCarrinho(ItemVenda itemVenda) {

		itemVendaRepository.save(itemVenda);
	}

}
