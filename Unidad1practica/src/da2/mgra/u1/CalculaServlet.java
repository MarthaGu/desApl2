package da2.mgra.u1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import da2.mgra.u1.CalculadoraMartha;

/**
 * Servlet implementation class CalculaServlet
 */
@WebServlet("/CalculaServlet")
public class CalculaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double valueX=Double.parseDouble(
				request.getParameter("valueX"));
		double valueY=Double.parseDouble(
				request.getParameter("valueY"));
		
		
		CalculadoraMartha operation2 =new CalculadoraMartha();
		operation2.setValueX(valueX);
		operation2.setValueY(valueY);
		request.setAttribute("op", operation2);
		
		RequestDispatcher dispatcher=
				request.getRequestDispatcher("resultado_calculadora.jsp");
		dispatcher.forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}




