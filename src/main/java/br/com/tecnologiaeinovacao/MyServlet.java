package br.com.tecnologiaeinovacao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ssdfs");
		response.getWriter().write("Hello World");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String mensagem = "Olá "+nome+", seja bem-vindo a nossa página!";
		request.setAttribute("mensagem",mensagem);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
