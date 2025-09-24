/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Usuario;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();
    private final String ARQUIVO_CSV = "usuarios.csv";

    public UsuarioController() {
        File arquivo = new File(ARQUIVO_CSV);
        try {
            if (!arquivo.exists()) {
                // Cria arquivo com cabeçalho se não existir
                try (FileWriter fw = new FileWriter(ARQUIVO_CSV)) {
                    fw.append("Nome,CPF,Email,Cargo,Login,Senha,Perfil\n");
                }
            } else {
                // Se o arquivo existe, carrega os usuários
                try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_CSV))) {
                    String linha;
                    br.readLine(); // pula o cabeçalho
                    while ((linha = br.readLine()) != null) {
                        String[] dados = linha.split(",");
                        if (dados.length >= 7) {
                            Usuario u = new Usuario(
                                dados[0], // Nome
                                dados[1], // CPF
                                dados[2], // Email
                                dados[3], // Cargo
                                dados[4], // Login
                                dados[5], // Senha
                                dados[6]  // Perfil
                            );
                            usuarios.add(u);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void salvarUsuario(Usuario u) {
        // Adiciona à lista em memória
        usuarios.add(u);
        // Salva no CSV
        salvarNoCSV(u);
    }

    private void salvarNoCSV(Usuario u) {
        try (FileWriter fw = new FileWriter(ARQUIVO_CSV, true)) { // true = append
            fw.append(String.join(",",
                u.getNome(),
                u.getCpf(),
                u.getEmail(),
                u.getCargo(),
                u.getLogin(),
                u.getSenha(),
                u.getPerfil()
            ));
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Retorna todos os usuários cadastrados em memória
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    // Método antigo opcional
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}





