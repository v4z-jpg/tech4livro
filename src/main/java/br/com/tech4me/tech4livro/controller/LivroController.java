package br.com.tech4me.tech4livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.tech4livro.model.Livro;
import br.com.tech4me.tech4livro.service.LivroService;

@RestController
@RequestMapping("/api/tech4livros")

public class LivroController {
    private static final String Id = null;
    @Autowired
    private LivroService servico;

    @GetMapping 
    public ResponseEntity<List<Livro>> obterLivros() {
        return new ResponseEntity<>(servico.obterLivros(), HttpStatus.FOUND);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Livro> obterLivro() {
        return new ResponseEntity<>(servico.obterLivroPorId(Id), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<Livro> cadastrarLivro(@RequestBody Livro livro) {
        return new ResponseEntity<>(servico.cadastrarLivro(livro), HttpStatus.CREATED);
        
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> excluirLivro(@PathVariable String id, @RequestBody Livro novoLivro) {
        servico.excluirLivro(id);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable String id, @RequestBody Livro novoLivro) {
        return new ResponseEntity<>(servico.atualizarLivro(id, novoLivro), HttpStatus.ACCEPTED);

    }

}
