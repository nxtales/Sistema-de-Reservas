/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import classes.Reserva;
import classes.SalaReuniao;
import java.time.LocalDateTime;

/**
 *
 * @author nzxtt
 */
@WebServlet(urlPatterns = {"/RemoverReservaServlet"})
public class RemoverReservaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obter o ID da reserva a ser removida
        String salaNome = request.getParameter("salareuniao");
        SalaReuniao sala = SalaReuniao.buscarSalaPorNome(salaNome);
        LocalDateTime inicio = LocalDateTime.parse(request.getParameter("inicio"));
        LocalDateTime fim = LocalDateTime.parse(request.getParameter("fim"));
        String reservadoPor = request.getParameter("reservadoPor");
        String quantasPessoas = request.getParameter("quantasPessoas");

        Reserva reserva = new Reserva();
        reserva.setSalareuniao(sala);
        reserva.setInicio(inicio);
        reserva.setFim(fim);
        reserva.setReservadoPor(reservadoPor);
        reserva.setQuantasPessoas(quantasPessoas);
        //Reserva reserva = request.getParameter("reserva");
            // Remover a reserva da lista
            Reserva.removerReserva(reserva);
       
        // Redirecionar de volta para a página de exibição de reservas
        response.sendRedirect("exibirReservas.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}