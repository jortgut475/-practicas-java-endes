package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DiaSemanaServlet
 */
public class DiaSemanaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaSemanaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("num");
		PrintWriter out=response.getWriter();
		
		try {
		Integer num_int=Integer.parseInt(num);
		
		switch (num_int) {
        case 1:
            out.print("Lunes");
            break; 
        case 2:
        	out.print("Martes");
            break;
        case 3:
        	out.print("Miercoles");
            break;
        case 4:
        	out.print("Jueves");
            break;
        case 5:
        	out.print("Viernes");
            break;
        case 6:
        	out.print("Sabado");
            break;
        case 7:
        	out.print("Domingo");
            break;
        default:
        	out.print("¡¡¡error!!!");
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
