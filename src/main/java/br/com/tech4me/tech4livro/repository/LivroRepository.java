package br.com.tech4me.tech4livro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.tech4livro.model.Livro;

public interface LivroRepository extends MongoRepository<Livro, String>{

}