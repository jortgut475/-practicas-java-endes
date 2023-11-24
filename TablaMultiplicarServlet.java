package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TablaMultiplicarServlet
 */
public class TablaMultiplicarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TablaMultiplicarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("num");
		PrintWriter out=response.getWriter();
		int resultado;
		try {
		Integer num_int=Integer.parseInt(num);
		
		if(num_int>=1 &&  num_int<=10) {
			out.println("Tabla de la multiplicar del "+ num_int+":");
	        
			for(int i=1;i<=10;i++){
	            resultado=num_int*i;
	            
	            out.println(num_int +"X" + i +"="+resultado);
	        }
	    }else{
	    	out.print( "Por favor ingrese un nº entre 1 y 10");
	    }
		}catch (Exception e) {
			out.print(e.toString());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
