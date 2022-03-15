package org.generation.lojagames.lojagames.controller;

import java.util.List;

import org.generation.lojagames.lojagames.model.ProdutoModel;
import org.generation.lojagames.lojagames.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoModel> getByEntity(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/descricaotitulo/{descricaoTitulo}")
	public ResponseEntity<List<ProdutoModel>> getByDescricaoTitulo(@PathVariable String descricaoTitulo){
		return ResponseEntity.ok(repository.findAllByDescricaoTituloContainingIgnoreCase(descricaoTitulo));
	}
	@PostMapping
	public ResponseEntity<ProdutoModel> post(@RequestBody ProdutoModel produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	@PutMapping
	public ResponseEntity<ProdutoModel> put(@RequestBody ProdutoModel produto){
		return ResponseEntity.ok(repository.save(produto));
	}
	@DeleteMapping
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
	

}