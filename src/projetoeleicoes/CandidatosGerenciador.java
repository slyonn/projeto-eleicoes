package projetoeleicoes;

import java.util.ArrayList;
import java.util.List;

public class CandidatosGerenciador {
    
    // LISTAS PARA GERENCIAR OS CANDIDATOS
    static List <Candidatos> listaDePresidentes = new ArrayList<>();
    static List <Candidatos> listaDeGovernadores = new ArrayList<>();
    
    
    // ADICIONAR PRESIDENTES NO ARRAY
    static void addCandidatosPresidentes(){
        Candidatos walterPresidente = new Candidatos ("Walter White", "17");
        Candidatos jessePresidente = new Candidatos ("Jesse Pinkman", "13");
        
        listaDePresidentes.add(walterPresidente);
        listaDePresidentes.add(jessePresidente);
    }
    
    // ADICIONAR GOVERNADORES NO ARRAY
    static void addCandidatosGovernadores(){
        Candidatos saulGovernador = new Candidatos ("Saul Goodman", "50");
        Candidatos tucoGovernador = new Candidatos ("Tuco Salamanca", "15");
        
        listaDeGovernadores.add(saulGovernador);
        listaDeGovernadores.add(tucoGovernador);
    }
    
    // PESQUISAR O PRESIDENTE RETORNANDO O NOME
    static String pesquisarPresidente (String n){
        for (int i = 0; i < listaDePresidentes.size(); i++) {
            if (listaDePresidentes.get(i).numero.equals(n)){
                return listaDePresidentes.get(i).nome;
            } 
        }
        return null;
    }
    
    // PESQUISAR PRESIDENTE RETORNANDO O PRESIDENTE
    static Candidatos pesquisarPresidenteCandidatos (String n){
         for (int i = 0; i < listaDePresidentes.size(); i++) {
            if (listaDePresidentes.get(i).numero.equals(n)){
                return listaDePresidentes.get(i);
            } 
        }
        return null;
    }
    
    // PESQUISAR GOVERNADOR RETORNANDO O NOME
    static String pesquisarGovernador (String n){
        for (int i = 0; i < listaDeGovernadores.size(); i++) {
            if (listaDeGovernadores.get(i).numero.equals(n)){
                return listaDeGovernadores.get(i).nome;
            } 
        }
        return null;
    }
    
    // PESQUISAR GOVERNADOR RETORNANDO O GOVERNADOR
    static Candidatos pesquisarGovernadorCandidatos (String n){
         for (int i = 0; i < listaDeGovernadores.size(); i++) {
            if (listaDeGovernadores.get(i).numero.equals(n)){
                return listaDeGovernadores.get(i);
            } 
        }
        return null;
    }
    
}
