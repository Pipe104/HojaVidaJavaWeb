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
import logic.Educacion;
import logic.ReferenciasLaborales;
import logic.ReferenciasPersonales;


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
        
        //Instancia para la experiencia y el perfil laboral
        Experiencia experiencia = new Experiencia();
        //Recibiendo los valores del perfil y la experiencia laboral
        experiencia.setExperiencia(request.getParameter("experiencia"));
        experiencia.setPerfil(request.getParameter("perfil"));
        
        
        //Instancia para la informacion personal
        InformacionPersonal Ipersonal= new InformacionPersonal();
        
        //Recibiendo los valores de cada dato personal
        Ipersonal.setNombre(request.getParameter("nombre"));
        Ipersonal.setIdentificacion(Long.parseLong(request.getParameter("identificacion")));
        Ipersonal.setNacimiento(request.getParameter("nacimiento"));
        Ipersonal.setEdad(Integer.parseInt(request.getParameter("edad")));
        Ipersonal.setSexo(request.getParameter("sexo"));
        Ipersonal.setTelefono(Long.parseLong(request.getParameter("telefono")));
        Ipersonal.setEmail(request.getParameter("email"));
        Ipersonal.setLibreta(request.getParameter("libreta"));
        Ipersonal.setFechaLibreta(request.getParameter("fechaLibreta"));
        
        //Intancia para las referencias laborales
        ReferenciasLaborales rLaborales = new ReferenciasLaborales();
        
        //Recibiendo las referencias laborales
        rLaborales.setRLpersona1(request.getParameter("nombre1"));
        rLaborales.setRLtelefono1(Long.parseLong(request.getParameter("telefono1")));
        rLaborales.setRLpersona2(request.getParameter("nombre2"));
        rLaborales.setRLtelefono2(Long.parseLong(request.getParameter("telefono2")));

        //Instancia para las referencias personales
        ReferenciasPersonales rPersonales = new ReferenciasPersonales();
        
        //Recibiendo las referencias personales
        rPersonales.setRPersona1(request.getParameter("nombre3"));
        rPersonales.setRTelefono1(Long.parseLong(request.getParameter("telefono3")));
        rPersonales.setRPersona2(request.getParameter("nombre4"));
        rPersonales.setRTelefono2(Long.parseLong(request.getParameter("telefono4")));
        
        //Intancia para la educacion
        Educacion educacion = new Educacion();
        
        //Recibiendo datos de la educacion
        educacion.setPrimaria(request.getParameter("primaria"));
        educacion.setFechaPrimaria(request.getParameter("fechaPrimaria"));
        educacion.setSecundaria(request.getParameter("secundaria"));
        educacion.setFechaSecundaria(request.getParameter("fechaSecundaria"));
        educacion.setUniversidad(request.getParameter("universidad"));
        educacion.setTitulo(request.getParameter("titulo"));
        educacion.setFechaUniversidad(request.getParameter("fechaUniversidad"));
                
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE out html>");
            out.println("<html>");
            out.println("<head>");
            out.println(    "<title>Hoja de vida organizada</title>");
            out.println(    "<link rel='stylesheet' href='estilos2.css'/>");
            out.println("</head>");
            out.println("<body>");
            out.println(    "<center>");
            out.println(    "<form method='get'>");
            out.println(        "<table border=2>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                    "<center>");
            out.println(                        "<img id='imagenSexo' src='" + Ipersonal.getImagenSexo() +"' alt='Imagen basada en el sexo' width='200px' height='200px'>");
            out.println(                    "</center>");
            out.println(                "</td>");
            out.println(                "<td>");
            out.println(                    "<center>");
            out.println(                        "<h1>" + Ipersonal.getNombre()+"</h1>");
            out.println(                    "</center>");
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                    "<p>Identificacion</p>");
            out.println(                        Ipersonal.getIdentificacion());
            out.println(                "</td>");
            out.println(                "<td rowspan='2'>");
            out.println(                    "<br>");
            out.println(                    "<p>Perfil profesional</p>");
            out.println(                    experiencia.getPerfil());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                    "<p>Fecha de nacimiento</p>");
            out.println(                    Ipersonal.getNacimiento());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                    "<p>Edad</p>");
            out.println(                    Ipersonal.getEdad());
            out.println(                "</td>");
            out.println(                "<td rowspan='4'>");
            out.println(                    "<br>");
            out.println(                    "<p>Experiencia Laboral</p>");
            out.println(                    experiencia.getExperiencia());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                        "<p>Sexo</p>");
            out.println(                        Ipersonal.getSexo());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                    "<p>¿Cuenta con libreta militar?</p>");
            out.println(                    Ipersonal.getLibreta());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                    "<p>Fecha de expedicion de la libreta militar</p>");
            out.println(                    Ipersonal.getFechaLibreta());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td></td>");
            out.println(                "<td rowspan='6'>");
            out.println(                    "<br>");
            out.println(                    "<p>Primera referencia laboral</p>");
            out.println(                    rLaborales.getRLpersona1());
            out.println(                    "<br>");
            out.println(                    rLaborales.getRLtelefono1());
            out.println(                    "<br><br>");
            out.println(                    "<p>Segunda referencia laboral</p>");
            out.println(                    rLaborales.getRLpersona2());
            out.println(                    "<br>");
            out.println(                    rLaborales.getRLtelefono2());
            out.println(                    "<br>");
            out.println(                    "<p>Primera referencia personal</p>");
            out.println(                    rPersonales.getRPersona1());
            out.println(                    "<br>");
            out.println(                    rPersonales.getRTelefono1());
            out.println(                    "<br><br>");
            out.println(                    "<p>Segunda referencia personal</p>");
            out.println(                    rPersonales.getRPersona2());
            out.println(                    "<br>");
            out.println(                    rPersonales.getRTelefono2());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                    "<p>Escuela primaria</p>");
            out.println(                    educacion.getPrimaria());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                    "<p>Fecha de graduacion de primaria</p>");
            out.println(                    educacion.getFechaPrimaria());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                    "<p>Escuela secundaria</p>");
            out.println(                    educacion.getSecundaria());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                    "<p>Fecha de graduacion de secundaria</p>");
            out.println(                    educacion.getFechaSecundaria());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td>");
            out.println(                    "<br>");
            out.println(                    "<p>Institucion de educacion superior</p>");
            out.println(                    educacion.getUniversidad());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td colspan='2'>");
            out.println(                    "<br>");
            out.println(                    "<p>Titulo de educacion superior</p>");
            out.println(                    educacion.getTitulo());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td colspan='2'>");
            out.println(                    "<br>");
            out.println(                    "<p>Fecha de graduacion de sus estudios de educacion superior</p>");
            out.println(                    educacion.getFechaUniversidad());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(            "<tr>");
            out.println(                "<td colspan='2'>");
            out.println(                    "<br>");
            out.println(                    "<p>&#9742; Telefono</p>");
            out.println(                    Ipersonal.getTelefono());
            out.println(                    "<br>");
            out.println(                    "<p>&#9993; Email</p>");
            out.println(                    Ipersonal.getEmail());
            out.println(                "</td>");
            out.println(            "</tr>");
            out.println(        "</table>");
            out.println(    "</form>");
            out.println(    "</center>");
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
