package br.com.tech4me.tech4livro.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("livros")
public class Livro {
    @Id
    private String id;   
    private String nome;
    private String autor;
    private String codigo;
    private Double valor;
    private Double numPag;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double getNumPag() {
        return numPag;
    }
    public void setNumPag(Double numPag) {
        this.numPag = numPag;
    }
    public void setId(String id2) {
    }
   
    public String getId() {
        return id;
    }

    


    
}
