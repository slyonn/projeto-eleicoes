package projetoeleicoes;

import java.util.ArrayList;
import java.util.List;

public class Urna {
    
    static int quantidadeTotalDeEleitores = EleitorGerenciador.listaEleitores.size();
    static int votosTotaisPresidentes = 0;
    static int votosTotaisGovernadores = 0;
    static int votosNulosTotais = 0;
    static int votosBrancosTotais = 0;
    static int votosNulosGovernadores = 0;
    static int votosBrancosGovernadores = 0;
    static int votosNulosPresidentes = 0;
    static int votosBrancosPresidentes = 0;
    static int quantidadeVotaram = 0;
    
    static float vetorPorcentagemPresidente[] = new float[CandidatosGerenciador.listaDePresidentes.size()];
    static float vetorPorcentagemGovernador[] = new float[CandidatosGerenciador.listaDeGovernadores.size()];
    
    static int nulosBrancosPresidentes[] = new int[2];
    
    public static void addNulosBrancosPresidentes(){
        nulosBrancosPresidentes[0] = votosNulosPresidentes;
        nulosBrancosPresidentes[1] = votosBrancosPresidentes;
    }
    
    static int nulosBrancosGovernadores[] = new int[2];
    
    public static void addNulosBrancosGovernadores(){
        nulosBrancosGovernadores[0] = votosNulosGovernadores;
        nulosBrancosGovernadores[1] = votosBrancosGovernadores;
    }
     
    public static void votarPresidente (String n){
        Candidatos resultado = CandidatosGerenciador.pesquisarPresidenteCandidatos(n);
        if (resultado != null){
            resultado.votos++;
            System.out.println(resultado + ": " + resultado.votos);
        } else {
            votosNulosTotais++;
            votosNulosPresidentes++;
        }
        
        BancoDeDados.salvarPresidente(CandidatosGerenciador.listaDePresidentes);
    }
    
    public static void votarPresidenteBranco(){
        quantidadeVotaram++;
        votosTotaisPresidentes++;
        votosBrancosTotais++;
        votosBrancosPresidentes++;
    }
    
    public static void votarGovernadorBranco(){
        quantidadeVotaram++;
        votosTotaisGovernadores++;
        votosBrancosTotais++;
        votosBrancosGovernadores++;
    }
    
    public static void votarGovernador (String n){
        Candidatos resultado = CandidatosGerenciador.pesquisarGovernadorCandidatos(n);
        if (resultado != null){
            System.out.println(resultado + ": " + resultado.votos);
            resultado.votos++;
        } else {
            votosNulosTotais++;
            votosNulosGovernadores++;
        }
        
        BancoDeDados.salvarGovernador(CandidatosGerenciador.listaDeGovernadores);
        
    }
    
    public static void calcularPorcentagemPresidentesVotados (){
        for (int i = 0; i < CandidatosGerenciador.listaDePresidentes.size(); i++) {
            vetorPorcentagemPresidente[i] = (100 * CandidatosGerenciador.listaDePresidentes.get(i).votos)/6;
        }
    }
    
    
    public static void calcularPorcentagemGovernadoresVotados (){
        for (int i = 0; i < CandidatosGerenciador.listaDePresidentes.size(); i++) {
            vetorPorcentagemGovernador[i] = (100 * CandidatosGerenciador.listaDeGovernadores.get(i).votos)/6;
        }
    }
    
    
    public static void calcularPorcentagemNulos (){
//        quantidadedeeleitores = 100
//        resultados.votos = x;
//        x = (100 * resultados.votos)/quantidadedeeleitores;
    }
    
    public static void calcularPorcentagemBrancos (){
//        quantidadedeeleitores = 100
//        resultados.votos = x;
//        x = (100 * resultados.votos)/quantidadedeeleitores;
    }
    
    public static void calcularAbsolutoBrancos(){
        
    }

    public static int getQuantidadeTotalDeEleitores() {
        return quantidadeTotalDeEleitores;
    }

    public static void setQuantidadeTotalDeEleitores(int quantidadeTotalDeEleitores) {
        Urna.quantidadeTotalDeEleitores = quantidadeTotalDeEleitores;
    }

    public static int getVotosTotaisPresidentes() {
        return votosTotaisPresidentes;
    }

    public static void setVotosTotaisPresidentes(int votosTotaisPresidentes) {
        Urna.votosTotaisPresidentes = votosTotaisPresidentes;
    }

    public static int getVotosTotaisGovernadores() {
        return votosTotaisGovernadores;
    }

    public static void setVotosTotaisGovernadores(int votosTotaisGovernadores) {
        Urna.votosTotaisGovernadores = votosTotaisGovernadores;
    }

    public static int getVotosNulosTotais() {
        return votosNulosTotais;
    }

    public static void setVotosNulosTotais(int votosNulosTotais) {
        Urna.votosNulosTotais = votosNulosTotais;
    }

    public static int getVotosBrancosTotais() {
        return votosBrancosTotais;
    }

    public static void setVotosBrancosTotais(int votosBrancosTotais) {
        Urna.votosBrancosTotais = votosBrancosTotais;
    }

    public static int getVotosNulosGovernadores() {
        return votosNulosGovernadores;
    }

    public static void setVotosNulosGovernadores(int votosNulosGovernadores) {
        Urna.votosNulosGovernadores = votosNulosGovernadores;
    }

    public static int getVotosBrancosGovernadores() {
        return votosBrancosGovernadores;
    }

    public static void setVotosBrancosGovernadores(int votosBrancosGovernadores) {
        Urna.votosBrancosGovernadores = votosBrancosGovernadores;
    }

    public static int getVotosNulosPresidentes() {
        return votosNulosPresidentes;
    }

    public static void setVotosNulosPresidentes(int votosNulosPresidentes) {
        Urna.votosNulosPresidentes = votosNulosPresidentes;
    }

    public static int getVotosBrancosPresidentes() {
        return votosBrancosPresidentes;
    }

    public static void setVotosBrancosPresidentes(int votosBrancosPresidentes) {
        Urna.votosBrancosPresidentes = votosBrancosPresidentes;
    }

    public static int getQuantidadeVotaram() {
        return quantidadeVotaram;
    }

    public static void setQuantidadeVotaram(int quantidadeVotaram) {
        Urna.quantidadeVotaram = quantidadeVotaram;
    }
     
}
