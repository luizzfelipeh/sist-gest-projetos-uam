/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

public class Equipe {

    private String nome;
    private String descricao;
    private List<Usuario> membros;

    public Equipe(String nome, String descricao, List<Usuario> membros) {
        this.nome = nome;
        this.descricao = descricao;
        this.membros = membros;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public List<Usuario> getMembros() { return membros; }
    public void setMembros(List<Usuario> membros) { this.membros = membros; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome).append(";").append(descricao).append(";");
        for (Usuario u : membros) {
            sb.append(u.getNome()).append(",");
        }
        return sb.toString();
    }
}

