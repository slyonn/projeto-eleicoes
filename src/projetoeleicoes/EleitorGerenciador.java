package projetoeleicoes;

import java.util.ArrayList;
import java.util.List;

public class EleitorGerenciador {

    // ARRAY DE ELEITORES PARA GERENCIAR OS ELEITORES
    static List <Eleitor> listaEleitores = new ArrayList<>();
    
    // ADICIONAR O ELEITORES NO ARRAY
    static void addCriarEleitor() {
        Eleitor eleitor1 = new Eleitor("Monica", "123", "111", true);
        listaEleitores.add(eleitor1);
        Eleitor eleitor2 = new Eleitor("Ross", "456", "111", true);
        listaEleitores.add(eleitor2);
        Eleitor eleitor3 = new Eleitor("Rachel", "789", "222", true);
        listaEleitores.add(eleitor3);
        Eleitor eleitor4 = new Eleitor("Chandler", "741", "222", true);
        listaEleitores.add(eleitor4);
        Eleitor eleitor5 = new Eleitor("Joey", "852", "333", true);
        listaEleitores.add(eleitor5);
        Eleitor eleitor6 = new Eleitor("Phoebe", "963", "333", true);
        listaEleitores.add(eleitor6);
    }

    // VERIFICAR SE O NÚMERO DE ELEITOR EXISTE
    static boolean checarNumeroEleitor(String numeroEleitor) {
        for (int i = 0; i < listaEleitores.size(); i++) {
            if (listaEleitores.get(i).getnDeEleitor().equals(numeroEleitor)) {
                return true;
            }
        }
        return false;
    }

    // VERIFICAR SE O ELEITOR EXISTE E RETORNÁ-LO
    static Eleitor pesquisarEleitor(String numeroEleitor) {
        for (int i = 0; i < listaEleitores.size(); i++) {
            if (listaEleitores.get(i).getnDeEleitor().equals(numeroEleitor)) {
                return listaEleitores.get(i);
            }
        }
        return null;
    }

    // VERIFICAR SE O ELEITOR PERTENCE À SEÇÃO INFORMADA
    static boolean checarSecaoEleitor(String titulo, String secao) {
        for (int i = 0; i < listaEleitores.size(); i++) {
            if (listaEleitores.get(i).getnDeEleitor().equals(titulo)) {
                if (listaEleitores.get(i).getSecao().equals(secao)){
                    return true;
                }
            }
        }
        return false;
    }

    // VERIFICAR SE O ELEITOR JÁ VOTOU
    static boolean checarVoto(String numeroEleitor) {
        for (int i = 0; i < listaEleitores.size(); i++) {
            if (listaEleitores.get(i).getnDeEleitor().equals(numeroEleitor)) {
                if (listaEleitores.get(i).isVoto() == true) {
                    return false;
                }
            }
        }
        return true;
    }

    // CHECAR SE EXISTE ALGUM ELEITOR COM O NOME INFORMADO (CASO PRECISASSE SER CADASTRADO)
    static boolean checarNomeIgual(String nome) {
        for (int i = 0; i < listaEleitores.size(); i++) {
            if (listaEleitores.get(i).getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    // VERIFICAR SE EXISTE ALGUM OUTRO ELEITOR COM MESMO NÚMERO (CASO PRECISASSE SER CADASTRADO)
    static boolean checarNumeroEleitorIgual(String numeroEleitor) {
        for (int i = 0; i < listaEleitores.size(); i++) {
            if (listaEleitores.get(i).getnDeEleitor().equals(numeroEleitor)) {
                return true;
            }
        }
        return false;
    }
    
    // VERIFICAR SE O LEITOR JUSTIFICOU O VOTO
    static boolean checarJustificar(String numeroEleitor){
        for (int i = 0; i < listaEleitores.size(); i++) {
            if (listaEleitores.get(i).getnDeEleitor().equals(numeroEleitor)) {
                if (listaEleitores.get(i).isJustificar() == true){
                    return false;
                }
            }
        }
        return true;
    }

    // GET'S E SET'S
    public static List<Eleitor> getListaEleitores() {
        return listaEleitores;
    }

    public static void setListaEleitores(List<Eleitor> listaEleitores) {
        EleitorGerenciador.listaEleitores = listaEleitores;
    }

}
