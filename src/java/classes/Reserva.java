/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 081210001
 */
public class Reserva {
    public LocalDate inicio;
    public LocalDate fim;
    public SalaReuniao salareuniao;
    public String reservadoPor;
    public String quantasPessoas;

    public static List<Reserva> listaReservas = new ArrayList<>();
    
    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public SalaReuniao getSalareuniao() {
        return salareuniao;
    }

    public void setSalareuniao(SalaReuniao salareuniao) {
        this.salareuniao = salareuniao;
    }

    public String getReservadoPor() {
        return reservadoPor;
    }

    public void setReservadoPor(String reservadoPor) {
        this.reservadoPor = reservadoPor;
    }

    public String getQuantasPessoas() {
        return quantasPessoas;
    }

    public void setQuantasPessoas(String quantasPessoas) {
        this.quantasPessoas = quantasPessoas;
    }
    
    
}

//https://www.codeproject.com/Articles/732679/HTML-Event-Calendar-Scheduler