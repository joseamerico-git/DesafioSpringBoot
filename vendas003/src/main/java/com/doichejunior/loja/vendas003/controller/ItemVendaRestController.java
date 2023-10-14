package com.doichejunior.loja.vendas003.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doichejunior.loja.vendas003.model.ItemVenda;
import com.doichejunior.loja.vendas003.service.ItemVendaService;

@RestController
@RequestMapping("itemVendas")
public class ItemVendaRestController {
	@Autowired
	private ItemVendaService itemVendaServce;

	@GetMapping
	public ResponseEntity<Iterable<ItemVenda>> buscarTodos() {
		return ResponseEntity.ok(itemVendaServce.buscarTodos());

	}

	@GetMapping("/{id}")
	public ResponseEntity<ItemVenda> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(itemVendaServce.buscarPorId(id));

	}

	@PostMapping
	public ResponseEntity<ItemVenda> inserir(@RequestBody ItemVenda itemVenda) {
		itemVendaServce.inserir(itemVenda);
		return ResponseEntity.ok(itemVenda);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ItemVenda> atualizar(@PathVariable Long id, @RequestBody ItemVenda itemVenda) {
		itemVendaServce.atualizar(id, itemVenda);
		return ResponseEntity.ok(itemVenda);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		itemVendaServce.deletar(id);
		return ResponseEntity.ok().build();
	}

}
