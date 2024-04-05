/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 081210001
 */
public class SalaReuniao {
    public String nome;
    public int disponibilidade;
    public int capacidade;
    
    public static List<SalaReuniao> listaSalasDeReuniao = new ArrayList<>();
    
    public static SalaReuniao buscarSalaPorNome(String salanome) {
    for (SalaReuniao sala : listaSalasDeReuniao) {
        if (sala.getNome().equals(salanome)) {
            return sala;
        }
    }
    return null; // Retorna null se a sala não for encontrada
}

    public SalaReuniao(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.disponibilidade = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
