package br.com.training.estoque;

import java.io.IOException;
import java.util.Date;

import java.text.ParseException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoEquipServlet
 */
@WebServlet("/novoEquipamento")
public class NovoEquipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Cadastrando novo Equipamento"); 
		
		String nomeEquipamento = request.getParameter("nomeEquipamento"); 
		String paramDataRegistroEquip = request.getParameter("data"); 
		
		
		Date dataRegistro = null; 
		try {
			
		}catch (ParseException e) {


		}
		
	}

}
