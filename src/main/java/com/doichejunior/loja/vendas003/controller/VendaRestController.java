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

import com.doichejunior.loja.vendas003.model.Venda;
import com.doichejunior.loja.vendas003.service.VendaService;

@RestController
@RequestMapping("vendas")
public class VendaRestController {
	@Autowired
	private VendaService vendaService;

	@GetMapping
	public ResponseEntity<Iterable<Venda>> buscarTodos() {
		return ResponseEntity.ok(vendaService.buscarTodos());

	}

	@GetMapping("/{id}")
	public ResponseEntity<Venda> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(vendaService.buscarPorId(id));

	}

	@PostMapping
	public ResponseEntity<Venda> inserir(@RequestBody Venda venda) {
		vendaService.inserir(venda);
		return ResponseEntity.ok(venda);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Venda> atualizar(@PathVariable Long id, @RequestBody Venda venda) {
		vendaService.atualizar(id, venda);
		return ResponseEntity.ok(venda);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		vendaService.deletar(id);
		return ResponseEntity.ok().build();
	}

}
