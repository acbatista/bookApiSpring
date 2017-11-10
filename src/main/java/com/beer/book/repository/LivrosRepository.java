package com.beer.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beer.book.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{

}
