package projetoeleicoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Secao implements Serializable { // IMPLEMENTANDO SERIALIZABLE PARA GUARDAR NO ARQUIVO
    
    // ATRIBUTOS
    
    public String numero;
    public boolean disponível = true;

    // GET'S E SET'S
    
    public Secao(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isDisponível() {
        return disponível;
    }

    public void setDisponível(boolean disponível) {
        this.disponível = disponível;
    }
    
}
