package main.java;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Recibir los datos del HTML
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        // Dibujar el resultado en el navegador
        out.println("<html>");
        out.println("<head><title>Resultado del Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Datos Procesados en Java</h1>");
        out.println("<p><strong>El usuario enviado es:</strong> " + usuario + "</p>");
        out.println("<p><strong>La contraseña enviada es:</strong> " + password + "</p>");
        out.println("<br><a href='InicioSesion.html'>Volver al Formulario</a>");
        out.println("</body>");
        out.println("</html>");
    }
}