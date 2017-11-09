package com.qualitas.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qualitas.entities.Cliente;
import com.qualitas.service.Service;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
private Service service;
	
	public Servlet(){
		
		service = new Service();
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		List<Cliente> clientes = service.getClientes();
		
		HttpSession session = request.getSession(true);
		
		// Almacena clientes en la sesion
		
		session.setAttribute("clientes", clientes);
		
		String nextJSP = "/index.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request,response);
		
		System.out.println("Se invoco el Servlet");
		
	}

}
