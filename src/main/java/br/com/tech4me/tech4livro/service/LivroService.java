package br.com.tech4me.tech4livro.service;

import java.util.List;

import br.com.tech4me.tech4livro.model.Livro;

public interface LivroService {
    List<Livro> obterLivros();
    Livro cadastrarLivro(Livro livro);
    Livro obterLivroPorId(String id);
    void excluirLivro(String id);
    Livro atualizarLivro (String id, Livro novoLivro);
    
}