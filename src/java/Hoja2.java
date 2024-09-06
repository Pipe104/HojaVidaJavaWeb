/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import logic.Experiencia;
import logic.InformacionPersonal;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author laver
 */
public class Hoja2 extends HttpServlet {

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
        
        //Instancia para la experiencia laboral
        Experiencia experiencia = new Experiencia();
        experiencia.setExperiencia(request.getParameter("experiencia"));
        
        //Instancia para la informacion personal
        InformacionPersonal Ipersonal= new InformacionPersonal();
        
        //Recibiendo los valores de cada dato personal
        Ipersonal.setNombre(request.getParameter("nombre"));
        Ipersonal.setIdentificacion(Integer.parseInt(request.getParameter("identificacion")));
        //Ipersonal.setNacimiento(Integer.parseInt(request.getParameter("nacimiento")));
        Ipersonal.setEdad(Integer.parseInt(request.getParameter("edad")));
        Ipersonal.setSexo(request.getParameter("sexo"));
        Ipersonal.setTelefono(Integer.parseInt(request.getParameter("telefono")));
        Ipersonal.setEmail(request.getParameter("email"));
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE out html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hoja de vida organizada</title>");
            out.println("<link rel='stylesheet' href='estilos2.css'/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<form method='get' action='pagina2.html'>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<center>");
            out.println("<img id='imagenSexo' src='' alt='Imagen basada en el sexo' width='200px' height='200px'>");
            out.println("</center>");
            out.println("</td>");
            out.println("<td>");
            out.println("<center>");
            out.println(Ipersonal.getNombre());
            out.println("</center>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<p>Identificacion</p>");
            out.println(Ipersonal.getIdentificacion());
            out.println("</td>");
            out.println("<td rowspan='2'>");
            out.println("<br>");
            out.println("<p>Perfil profesional</p>");
            out.println("<div class='text-area-output' id='perfil'></div>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<p>Fecha de nacimiento</p>");
            out.println(Ipersonal.getNacimiento());
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<p>Edad</p>");
            out.println(Ipersonal.getEdad());
            out.println("</td>");
            out.println("<td rowspan='4'>");
            out.println("<br>");
            out.println("<p>Experiencia Laboral</p>");
            out.println(experiencia.getExperiencia());
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<p>Sexo</p>");
            out.println(Ipersonal.getSexo());
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<p>¿Cuenta con libreta militar?</p>");
            out.println("<span id='libreta'></span>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<p>Fecha de expedicion de la libreta militar</p>");
            out.println("<span id='fechaLibreta'></span>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td></td>");
            out.println("<td rowspan='6'>");
            out.println("<br>");
            out.println("<p>Primera referencia laboral</p>");
            out.println("<span id='nombre1'></span>");
            out.println("<br>");
            out.println("<span id='telefono1'></span>");
            out.println("<br><br>");
            out.println("<p>Segunda referencia laboral</p>");
            out.println("<span id='nombre2'></span>");
            out.println("<br>");
            out.println("<span id='telefono2'></span>");
            out.println("<br>");
            out.println("<p>Primera referencia personal</p>");
            out.println("<span id='nombre3'></span>");
            out.println("<br>");
            out.println("<span id='telefono3'></span>");
            out.println("<br><br>");
            out.println("<p>Segunda referencia personal</p>");
            out.println("<span id='nombre4'></span>");
            out.println("<br>");
            out.println("<span id='telefono4'></span>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<p>Escuela primaria</p>");
            out.println("<span id='primaria'></span>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<p>Fecha de graduacion de primaria</p>");
            out.println("<span id='fechaPrimaria'></span>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<p>Escuela secundaria</p>");
            out.println("<span id='secundaria'></span>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<p>Fecha de graduacion de secundaria</p>");
            out.println("<span id='fechaSecundaria'></span>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<p>Institucion de educacion superior</p>");
            out.println("<span id='universidad'></span>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<p>Titulo de educacion superior</p>");
            out.println("<span id='titulo'></span>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<br>");
            out.println("<p>Fecha de graduacion de sus estudios de educacion superior</p>");
            out.println("<span id='fechaUniversidad'></span>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan='2'>");
            out.println("<br>");
            out.println("<p>&#9742; Telefono</p>");
            out.println(Ipersonal.getTelefono());
            out.println("<br>");
            out.println("<p>&#9993; Email</p>");
            out.println(Ipersonal.getEmail());
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }
        finally { 
            out.close();
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
