package projetoeleicoes;

import java.io.Serializable;

public class Candidatos implements Serializable { // IMPLEMENTAR SERIALIZABLE PARA QUE A CLASSE SEJA ARQUIVADA
    
    // ATRIBUTOS DA CLASSE
    protected String nome;
    protected String numero;
    protected int votos;
    
    // CONSTRUTOR 
    public Candidatos (String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }
    
    // GET'S E SET'S
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
}
