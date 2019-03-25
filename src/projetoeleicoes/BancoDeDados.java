package projetoeleicoes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class BancoDeDados {

    // DECLARANDO OS DIRATÓRIOS DOS ARQUIVOS
    static final String caminhoGovernador = "arquivoGovernador.txt";
    static final String caminhoPresidente = "arquivoPresidente.txt";
    static final String caminhoEleitor = "arquivoEleitor.txt";
    static final String caminhoSecao = "arquivoSecao.txt";

    // MÉTODOS PARA ARQUIVAR E LER AS LISTAS DE GOVERNADORES, PRESIDENTES, SEÇÕES E ELEITORES
    
    public static void salvarGovernador(List<Candidatos> governadores) {
        try (ObjectOutputStream streamOut = new ObjectOutputStream(new FileOutputStream(caminhoGovernador))) {
            streamOut.writeObject(governadores);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    public static List<Candidatos> lerArquivoGovernador() {
        if (new File(caminhoGovernador).canRead()) {
            try (ObjectInputStream streamIn = new ObjectInputStream(new FileInputStream(caminhoGovernador))) {
                List<Candidatos> governadores = (List<Candidatos>) streamIn.readObject();
                return governadores;
            } catch (FileNotFoundException ex) {

            } catch (ClassNotFoundException | IOException ex) {

            }
        }
        return null;
    }

    public static void salvarPresidente(List<Candidatos> presidentes) {
        try (ObjectOutputStream streamOut = new ObjectOutputStream(new FileOutputStream(caminhoPresidente))) {
            streamOut.writeObject(presidentes);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    public static List<Candidatos> lerArquivoPresidente() {
        if (new File(caminhoPresidente).canRead()) {
            try (ObjectInputStream streamIn = new ObjectInputStream(new FileInputStream(caminhoPresidente))) {
                List<Candidatos> presidentes = (List<Candidatos>) streamIn.readObject();
                return presidentes;
            } catch (FileNotFoundException ex) {

            } catch (ClassNotFoundException | IOException ex) {

            }
        }
        return null;
    }
    
    public static void salvarEleitor(List<Eleitor> eleitores) {
        try (ObjectOutputStream streamOut = new ObjectOutputStream(new FileOutputStream(caminhoEleitor))) {
            streamOut.writeObject(eleitores);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }
    
    public static List <Eleitor> lerArquivoEleitor() {
        if (new File(caminhoEleitor).canRead()) {
            try (ObjectInputStream streamIn = new ObjectInputStream(new FileInputStream(caminhoEleitor))) {
                List <Eleitor> eleitores = (List<Eleitor>) streamIn.readObject();
                return eleitores;
            } catch (FileNotFoundException ex) {

            } catch (ClassNotFoundException | IOException ex) {

            }
        }
        return null;
    }

    public static void salvarSecao(List<Secao> secoes) {
        try (ObjectOutputStream streamOut = new ObjectOutputStream(new FileOutputStream(caminhoSecao))) {
            streamOut.writeObject(secoes);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    public static List <Secao> lerArquivoSecao() {
        if (new File(caminhoEleitor).canRead()) {
            try (ObjectInputStream streamIn = new ObjectInputStream(new FileInputStream(caminhoSecao))) {
                List <Secao> secoes = (List <Secao>) streamIn.readObject();
                return secoes;
            } catch (FileNotFoundException ex) {

            } catch (ClassNotFoundException | IOException ex) {

            }
        }
        return null;
    }

}
