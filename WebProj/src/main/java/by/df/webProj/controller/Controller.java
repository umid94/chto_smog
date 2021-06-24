package by.df.webProj.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Controller() {
    	
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		   String login = request.getParameter("login");
		   String password = request.getParameter("password");
			
		   PrintWriter out = response.getWriter();
		   System.out.println("Welcome to the Breaking news " + login);
		   
		   

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		String Lastname = request.getParameter("Lastname");
	    String Firstname = request.getParameter("Firstname");
			
		   PrintWriter out = response.getWriter();
		   System.out.println("You are succesfuly registrated " + Lastname + " " + Firstname);
	}

}
