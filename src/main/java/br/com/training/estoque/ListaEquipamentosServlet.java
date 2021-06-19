package br.com.training.estoque;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaEquipamentos")
public class ListaEquipamentosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BancoEquip banco = new BancoEquip(); 
		List<Equipamentos> lista = banco.getEquipamentos(); 
		
		request.setAttribute("equipamentos", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaEquipamentos.jsp"); 
		rd.forward(request, response);
	}
	
}
