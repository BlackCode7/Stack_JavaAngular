package com.blackCode.cadastro.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blackCode.cadastro.entity.ProdutoEntity;
import com.blackCode.cadastro.repository.ProdutoRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ProdutoController {
	
	//@Autowired
	private ProdutoRepository repository;

	@GetMapping(path="/api/produto/{id}")
		public ResponseEntity consultar(@PathVariable("id") Long id) {
			return repository.findById(id)
					.map(record -> ResponseEntity.ok().body(record))
					.orElse(ResponseEntity.notFound().build());
	} 		
	// Pega todos os produtos
	@GetMapping("/api/produtos")
	public List<ProdutoEntity> getAllProdutos(){
		return repository.findAll();
	}	
	//Salva todos produto por ID
	@GetMapping("/api/produtos/{id}")
	public ProdutoEntity getProdutoEntityById(@PathVariable Long id) {
		//ProdutoEntity produtoEntiry = this.obterProdutoEntity.obterProdutoService(id);
		//return new ProdutoEntity(21, "Cast", "2.0", "2000");
		
		return repository.findById(id).get();
	}
	
	// Salvando todos os produtos
	@PostMapping("/api/produtos")
	public ProdutoEntity saveProdutoEntity(@RequestBody ProdutoEntity produtoentity) {
		return repository.save(produtoentity);
	}
	
	@DeleteMapping("/api/produtos/{id}")
	public void deleteProdutoEntity(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
