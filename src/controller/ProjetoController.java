/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Usuario;
import model.Projeto;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProjetoController {

    private List<Projeto> projetos = new ArrayList<>();
    private final String arquivoCSV = "projetos.csv";

    // Método para salvar projeto na lista e no CSV
    public void salvarProjeto(Projeto p) {
        projetos.add(p);
        salvarCSV(p);
    }

    // Método que escreve no CSV
    private void salvarCSV(Projeto p) {
        try (FileWriter writer = new FileWriter(arquivoCSV, true)) {
            writer.append(p.toString());
            writer.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Opcional: método para retornar todos os projetos
    public List<Projeto> getProjetos() {
        return projetos;
    }
}

