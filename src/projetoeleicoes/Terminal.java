package projetoeleicoes;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    
    private int secao;
    private List <Eleitor> eleitores = new ArrayList<>();
    
    public boolean aptoVotar(){
      return true;  
    }

    public int getSecao() {
        return secao;
    }

    public void setSecao(int secao) {
        this.secao = secao;
    }

    public List<Eleitor> getEleitores() {
        return eleitores;
    }

    public void setEleitores(List<Eleitor> eleitores) {
        this.eleitores = eleitores;
    }
    
}
