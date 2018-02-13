

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/anyadir")
public class AnyadirAtributo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AnyadirAtributo() {super();}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Obtenemos las variables del formulario index. //
		String atributo = request.getParameter("atributo");
		String valor = request.getParameter("valor");
		
		// Guardarmos en session los valores //
		HttpSession sesion = request.getSession();
		
		// Añadimos a la sesión la información del formulario //
		sesion.setAttribute(atributo, valor);
		
		// Salida del ServLet para el usuario //
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>SESIONES</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>SESIONES DE USUARIO</h1>");
		out.println("<p>Resultados</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
}
