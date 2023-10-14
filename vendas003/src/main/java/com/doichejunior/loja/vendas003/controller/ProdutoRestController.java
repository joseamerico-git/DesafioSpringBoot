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

import com.doichejunior.loja.vendas003.model.Produto;
import com.doichejunior.loja.vendas003.service.ProdutoService;

@RestController
@RequestMapping("produtos")
public class ProdutoRestController {
	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public ResponseEntity<Iterable<Produto>> buscarTodos() {
		return ResponseEntity.ok(produtoService.buscarTodos());

	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(produtoService.buscarPorId(id));

	}

	@PostMapping
	public ResponseEntity<Produto> inserir(@RequestBody Produto produto) {
		produtoService.inserir(produto);
		return ResponseEntity.ok(produto);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
		produtoService.atualizar(id, produto);
		return ResponseEntity.ok(produto);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		produtoService.deletar(id);
		return ResponseEntity.ok().build();
	}

}
