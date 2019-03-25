package projetoeleicoes;

import java.io.Serializable;

public class Eleitor implements Serializable{
    
    // ATRIBUTOS 
    private String nome;
    private String nDeEleitor;
    private String secao; // SEÇÃO A QUE O ELEITOR PERTENCE
    private boolean voto = false; // VERIFICA SE O ELEITOR JÁ VOTOU
    private boolean justificar = false; // VERIFICA SE O ELEITOR JUSTIFICOU O VOTO
    private boolean habilitado = false; // VERIFICA SE O ELEITOR ESTÁ HABILITADO
    
    // CONSTRUTOR
    public Eleitor (String nome, String nDeEleitor, String secao, boolean habilitado){
        this.nome = nome;
        this.nDeEleitor = nDeEleitor;
        this.secao = secao;
        this.habilitado = habilitado;
    }

    // GET'S E SET'S
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnDeEleitor() {
        return nDeEleitor;
    }

    public void setnDeEleitor(String nDeEleitor) {
        this.nDeEleitor = nDeEleitor;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public boolean isVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }

    public boolean isJustificar() {
        return justificar;
    }

    public void setJustificar(boolean justificar) {
        this.justificar = justificar;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    
}