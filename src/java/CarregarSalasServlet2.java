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
import classes.SalaReuniao;

/**
 *
 * @author nzxtt
 */
@WebServlet(name = "CarregarSalasServlet", urlPatterns = {"/CarregarSalasServlet"})
public class CarregarSalasServlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SalaReuniao.listaSalasDeReuniao.add(new SalaReuniao("Butter", 10));
        SalaReuniao.listaSalasDeReuniao.add(new SalaReuniao("Dynamite", 15));
        SalaReuniao.listaSalasDeReuniao.add(new SalaReuniao("Permission to Dance", 20));
        SalaReuniao.listaSalasDeReuniao.add(new SalaReuniao("Life Goes On", 5));
        SalaReuniao.listaSalasDeReuniao.add(new SalaReuniao("Boy With Luv", 12));
        SalaReuniao.listaSalasDeReuniao.add(new SalaReuniao("Spring Day", 8));
        SalaReuniao.listaSalasDeReuniao.add(new SalaReuniao("DNA", 18));
        SalaReuniao.listaSalasDeReuniao.add(new SalaReuniao("Mic Drop", 25));
        SalaReuniao.listaSalasDeReuniao.add(new SalaReuniao("Fake Love", 3));
        SalaReuniao.listaSalasDeReuniao.add(new SalaReuniao("Idol", 7));
        
        request.setAttribute("salas", SalaReuniao.listaSalasDeReuniao);
        request.getRequestDispatcher("reservar-sala.jsp").forward(request, response);
    }
        
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CarregarSalasServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CarregarSalasServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
