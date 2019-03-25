package projetoeleicoes;

import java.util.ArrayList;
import java.util.List;

public class SecaoGerenciador {
    
    // ARRAY DO TIPO SECAO PARA MANIPULAR AS SEÇÕES CADASTRADAS
    static List <Secao> listaSecoes = new ArrayList<>();
    
    // ADICIONAR AS SEÇÕES NO ARRAY
    public static void addCriarSecao(){
        Secao secao1 = new Secao("111");
        Secao secao2 = new Secao("222");
        Secao secao3 = new Secao("333");
        
        listaSecoes.add(secao1);
        listaSecoes.add(secao2);
        listaSecoes.add(secao3);
    }
     
    // VERIFICAR SE A SEÇÃO EXISTE NO ARRAY - BOOLEAN
    public static boolean checarSecao(String numero){
        for (int i = 0; i < listaSecoes.size(); i++) {
            if (listaSecoes.get(i).getNumero().equals(numero)){
                return true;
            }
        }
        return false;
    }
    
    // VERIFICAR SE A SEÇÃO EXISTE NO ARRAY - SECAO
    public static Secao checarSecaoSecao(String numero){
        for (int i = 0; i < listaSecoes.size(); i++) {
            if (listaSecoes.get(i).getNumero().equals(numero)){
                return listaSecoes.get(i);
            }
        }
        return null;
    }
    
    // VERIFICAR SE A VOTAÇÃO FOI ENCERRADA A SEÇÃO
    public static boolean checarDisponibilidadeSecao(String numero){
        for (int i = 0; i < listaSecoes.size(); i++) {
            if (listaSecoes.get(i).getNumero().equals(numero)){
                if (listaSecoes.get(i).isDisponível() == true){
                    return true;
                }
            }
        }
        return false;
    }
    
    // ESCREVER A LISTA DE SEÇÕES
    public static String toStringSecoes(int i){
        if (!listaSecoes.isEmpty()){
            return "Seçã Nº " + listaSecoes.get(i).getNumero() + "\n";
        } else {
            return "Nenhuma seção cadastrada.";
        }
    }
    
}
