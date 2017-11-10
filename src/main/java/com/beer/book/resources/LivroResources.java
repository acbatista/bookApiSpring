package com.beer.book.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beer.book.domain.Livro;
import com.beer.book.repository.LivrosRepository;

@RestController
@RequestMapping(value = "/livros")
public class LivroResources {
	
	@Autowired
	private LivrosRepository livrosRepository;
	
	@RequestMapping( method = RequestMethod.GET)
	public List<Livro> listar() {
		
		return livrosRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Livro livro) {
		livrosRepository.save(livro);
	} 
}
