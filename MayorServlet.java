package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MayorServlet
 */
public class MayorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1=request.getParameter("num1");
		String num2=request.getParameter("num2");
		String num3=request.getParameter("num3");
		
		PrintWriter out=response.getWriter();
		
		try {
		Integer num1_int=Integer.parseInt(num1);
		Integer num2_int=Integer.parseInt(num2);
		Integer num3_int=Integer.parseInt(num3);
		
		if(num1_int>num2_int && num1_int>num3_int) {
			out.print("El numero 1 es el mayor");
		}else if(num2_int>num1_int && num2_int>num3_int){
			out.print("El numero 2 es el mayor ");
		}else {
			out.print("el numero 3 el es mayor");
		}
		}catch (Exception e) {
			out.print(e.toString());
		}
	}
}