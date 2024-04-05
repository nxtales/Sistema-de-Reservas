/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 081210001
 */
public class Reserva {
    public LocalDateTime inicio;
    public LocalDateTime fim;
    public SalaReuniao salareuniao;
    public String reservadoPor;
    public String quantasPessoas;

    public static List<Reserva> listaReservas = new ArrayList<>();
    
public static void removerReserva(Reserva reserva) {
    listaReservas.removeIf(r ->
            r.getSalareuniao().equals(reserva.getSalareuniao()) &&
            r.getInicio().equals(reserva.getInicio()) &&
            r.getReservadoPor().equals(reserva.getReservadoPor())
    );
}

    
    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
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