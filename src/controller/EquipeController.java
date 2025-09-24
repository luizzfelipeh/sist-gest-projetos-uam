/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Equipe;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EquipeController {

    private List<Equipe> equipes = new ArrayList<>();
    private final String ARQUIVO_CSV = "equipes.csv";

    public EquipeController() {
        // Cria o CSV se não existir com cabeçalho
        File arquivo = new File(ARQUIVO_CSV);
        try {
            if (!arquivo.exists()) {
                try (FileWriter fw = new FileWriter(ARQUIVO_CSV)) {
                    fw.append("Nome,Descricao,Membros\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void salvarEquipe(Equipe e) {
        // Adiciona à lista em memória
        equipes.add(e);

        // Salva no CSV
        salvarNoCSV(e);
    }

    private void salvarNoCSV(Equipe e) {
        try (FileWriter fw = new FileWriter(ARQUIVO_CSV, true)) { // true = append
            // Membros separados por ";"
            String nomesMembros = String.join(";", 
                e.getMembros().stream().map(u -> u.getNome()).toArray(String[]::new)
            );
            fw.append(String.join(",", e.getNome(), e.getDescricao(), nomesMembros));
            fw.append("\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public List<Equipe> listarEquipes() {
        return equipes;
    }
}


